<?xml version="1.0" encoding="UTF-8"?>
<!-- 
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 -->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0">
    <!-- Table rendering -->
    <!-- Generation for tables with THEAD and TBODY -->
    <xsl:template match="table" name="find-max-columns">
        <!-- Before we do anything, we need to scan the table to find the maximum span -->
        <xsl:param name="row">1</xsl:param>
        <xsl:param name="maxColumns">1</xsl:param>
        <!-- Get current row based on $row parameter -->
        <xsl:variable name="currentRow" select="thead/tr[position()=$row]"/>
        <!-- Calculate the number of columns in this row. This will be the number
         of th cells that don't have @colspan attributes, plus the sum of all
         @colspan attributes in th cells that have them.
         This algorithm isn't foolproof, because table headers with overlapping
         rowspans could hose the counting under certain conditions.
    -->
        <xsl:variable name="nColumns" select="count($currentRow/th) + sum($currentRow/th/@colspan) - count($currentRow/th/@colspan)"/>
        <xsl:variable name="newMaxColumns">
            <xsl:choose>
                <xsl:when test="$nColumns &gt; $maxColumns">
                    <xsl:value-of select="$nColumns"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$maxColumns"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Iterate through the template again if there are more rows -->
        <xsl:choose>
            <xsl:when test="thead/tr[position()=$row+1]">
                <xsl:call-template name="find-max-columns">
                    <xsl:with-param name="row" select="$row+1"/>
                    <xsl:with-param name="maxColumns" select="$newMaxColumns"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:call-template name="print-table">
                    <xsl:with-param name="spacerSpanColumns" select="$newMaxColumns"/>
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <xsl:template name="print-table">
        <xsl:param name="spacerSpanColumns">1</xsl:param>
        <xsl:comment> :::::: New table :::::: </xsl:comment>
        <fo:block xsl:use-attribute-sets="table.padding">
            <fo:table table-layout="fixed" table-omit-footer-at-break="false">
                <!-- The next template calculates table column widths e.g.,...
                <fo:table-column column-width="1.25in"/>
                <fo:table-column column-width="5.0in"/>
                -->
                <xsl:call-template name="calculate-column-widths"/>
                <fo:table-header>
                    <!-- If there is a 'title' attribute, output a title row -->
                    <xsl:if test="@title">
                        <xsl:comment> This table has a @title, so add a row for it </xsl:comment>
                        <fo:table-row keep-together="always" keep-with-next="always">
                            <fo:table-cell number-columns-spanned="{$spacerSpanColumns}" xsl:use-attribute-sets="table.title.cell">
                                <fo:block xsl:use-attribute-sets="table.title.block">
                                    <xsl:value-of select="@title"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:if>
                    <!-- Process any thead elements -->
                    <xsl:apply-templates select="thead">
                        <xsl:with-param name="spacerSpanColumns" select="$spacerSpanColumns"/>
                    </xsl:apply-templates>
                </fo:table-header>
                <!-- If there is a caption element, output a table-footer -->
                <fo:table-footer>
                    <!-- If there is a caption, add it -->
                    <xsl:if test="caption">
                        <xsl:comment> This table has a caption, so add a row for it </xsl:comment>
                        <fo:table-row>
                            <fo:table-cell number-columns-spanned="{$spacerSpanColumns}" xsl:use-attribute-sets="table.footer.cell">
                                <fo:block xsl:use-attribute-sets="table.footer.block">
                                    <xsl:value-of select="caption"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:if>
                </fo:table-footer>
                <!-- Process any tbody/tr or tr records -->
                <fo:table-body>
                    <xsl:apply-templates select="tbody/tr | tr">
                        <xsl:with-param name="spacerSpanColumns" select="$spacerSpanColumns"/>
                    </xsl:apply-templates>
                </fo:table-body>
            </fo:table>
        </fo:block>
    </xsl:template>
    <!-- Generation for tables without THEAD and TBODY -->
    <xsl:template match="table[count(thead)=0]" name="html-find-max-columns">
        <!-- Before we do anything, we need to scan the table to find the maximum span -->
        <xsl:param name="row">1</xsl:param>
        <xsl:param name="maxColumns">1</xsl:param>
        <!-- Get current row based on $row parameter -->
        <xsl:variable name="currentRow" select="tr[position()=$row]"/>
        <!-- Calculate the number of columns in this row. This will be the number
         of th cells that don't have @colspan attributes, plus the sum of all
         @colspan attributes in th cells that have them.
         This algorithm isn't foolproof, because table headers with overlapping
         rowspans could hose the counting under certain conditions.
        -->
        <xsl:variable name="nColumns" select="count($currentRow/th) + count($currentRow/tr) + sum($currentRow/th/@colspan) + sum($currentRow/tr/@colspan) - count($currentRow/th/@colspan) - count($currentRow/tr/@colspan)"/>
        <xsl:variable name="newMaxColumns">
            <xsl:choose>
                <xsl:when test="$nColumns &gt; $maxColumns">
                    <xsl:value-of select="$nColumns"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$maxColumns"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Iterate through the template again if there are more rows -->
        <xsl:choose>
            <xsl:when test="tr[position()=$row+1]">
                <xsl:call-template name="html-find-max-columns">
                    <xsl:with-param name="row" select="$row+1"/>
                    <xsl:with-param name="maxColumns" select="$newMaxColumns"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:call-template name="html-print-table">
                    <xsl:with-param name="spacerSpanColumns" select="$newMaxColumns"/>
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <xsl:template name="html-print-table">
        <xsl:param name="spacerSpanColumns">1</xsl:param>
        <xsl:comment> :::::: New table :::::: </xsl:comment>
        <fo:block xsl:use-attribute-sets="table.padding">
            <fo:table table-layout="fixed" table-omit-footer-at-break="false">
                <!-- The next template calculates table column widths e.g.,...
                <fo:table-column column-width="1.25in"/>
                <fo:table-column column-width="5.0in"/>
                -->
                <xsl:call-template name="html-calculate-column-widths"/>
                <fo:table-header>
                    <!-- If there is a 'title' attribute, output a title row -->
                    <xsl:if test="@title">
                        <xsl:comment> This table has a @title, so add a row for it </xsl:comment>
                        <fo:table-row keep-together="always" keep-with-next="always">
                            <fo:table-cell number-columns-spanned="{$spacerSpanColumns}" xsl:use-attribute-sets="table.title.cell">
                                <fo:block xsl:use-attribute-sets="table.title.block">
                                    <xsl:value-of select="@title"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:if>
                    <!-- if the first row is only made of table headers cells (th)
                    then we will simulate that this row is the table header.
                    (As if there was a thead block                    
                    -->
                    <xsl:if test="tr[1][count(*)=count(th)]">
                        <!-- Process any tr elements -->
                        <xsl:apply-templates select="tr[1][count(*)=count(th)]"/>
                        <!-- Add a spacer: 4 pt total, 1 pt black line -->
                        <xsl:comment> Table heading bottom spacer </xsl:comment>
                        <fo:table-row keep-with-previous="always">
                            <fo:table-cell padding-after="4.75pt" number-columns-spanned="{$spacerSpanColumns}">
                                <fo:block line-height="1pt">
                                    <fo:leader xsl:use-attribute-sets="table.heading.rule"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:if>
                </fo:table-header>
                <!-- If there is a caption element, output a table-footer -->
                <fo:table-footer>
                    <!-- If there is a caption, add it -->
                    <xsl:if test="caption">
                        <xsl:comment> This table has a caption, so add a row for it </xsl:comment>
                        <fo:table-row>
                            <fo:table-cell number-columns-spanned="{$spacerSpanColumns}" xsl:use-attribute-sets="table.footer.cell">
                                <fo:block xsl:use-attribute-sets="table.footer.block">
                                    <xsl:value-of select="caption"/>
                                </fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </xsl:if>
                </fo:table-footer>
                <!-- Process any tbody/tr or tr records -->
                <fo:table-body>
                    <xsl:apply-templates select="tr[position()!=1][count(*)!=count(th)]">
                        <xsl:with-param name="spacerSpanColumns" select="$spacerSpanColumns"/>
                    </xsl:apply-templates>
                </fo:table-body>
            </fo:table>
        </fo:block>
    </xsl:template>
    <!-- body table row -->
    <xsl:template match="table/tr | table/tbody/tr">
        <xsl:param name="spacerSpanColumns">1</xsl:param>
        <xsl:variable name="nColumns" select="count(th | td)
                                        + sum(th/@colspan |td/@colspan)
                                        - count(th/@colspan | td/@colspan)"/>
        <!-- Table body rows work as follows:
         - If the current row is not followed by a 'subheading' row,
           add a bottom border
           - If the current row is also the last row, add a
             'final' bottom border, otherwise a 'normal' bottom border
         - Otherwise, do not add a bottom border
         - Process the row by building table cells one at a time
        -->
        <!-- Format the table row -->
        <xsl:comment> ::: Table body row <xsl:value-of select="position()"/> (<xsl:value-of select="$nColumns"/> columns) ::: </xsl:comment>
        <fo:table-row xsl:use-attribute-sets="table.body.row">
            <xsl:apply-templates select="th|td"/>
        </fo:table-row>
        <!-- Add in a spacer/border row -->
        <xsl:comment> ::: Table row spacer for row <xsl:value-of select="position()"/> ::: </xsl:comment>
        <fo:table-row keep-with-previous="always">
            <fo:table-cell padding-after="3pt" number-columns-spanned="{$nColumns}">
                <fo:block line-height="1pt">
                    <xsl:choose>
                        <!-- If next row contains a th; no border, 2pt padding, 1pt white rule -->
                        <xsl:when test="following-sibling::tr[1]/th">
                            <xsl:comment> Spacer only </xsl:comment>
                            <fo:leader xsl:use-attribute-sets="table.body.norule"/>
                        </xsl:when>
                        <!-- If a row follows; regular border -->
                        <xsl:when test="following-sibling::tr[1]">
                            <xsl:comment> Regular border (rule) </xsl:comment>
                            <fo:leader xsl:use-attribute-sets="table.body.rule"/>
                        </xsl:when>
                        <!-- Last row border -->
                        <xsl:otherwise>
                            <xsl:comment> Ending border (rule) </xsl:comment>
                            <fo:leader xsl:use-attribute-sets="table.body.lastrule"/>
                        </xsl:otherwise>
                    </xsl:choose>
                </fo:block>
            </fo:table-cell>
        </fo:table-row>
    </xsl:template>
    <!-- a row containing at least a head cell -->
    <xsl:template match="table/tbody/tr[th] | table/tr[th]">
        <xsl:comment> ::: Subheading row ::: </xsl:comment>
        <!-- Changed from table.body.row (a bug!) -->
        <fo:table-row xsl:use-attribute-sets="table.subheading.row">
            <xsl:apply-templates select="th|td"/>
        </fo:table-row>
    </xsl:template>
    <!-- The last row -->
    <xsl:template match="table/tbody/tr[last()] | table/tr[last()]">
        <xsl:param name="spacerSpanColumns">1</xsl:param>
        <xsl:variable name="nColumns" select="count(th|td) + sum(th/@colspan|td/@colspan) - count(th/@colspan|td/@colspan)"/>
        <!-- Format the table row -->
        <xsl:comment> ::: Table body row <xsl:value-of select="position()"/> (<xsl:value-of select="$nColumns"/> columns) ::: </xsl:comment>
        <fo:table-row xsl:use-attribute-sets="table.body.row">
            <xsl:apply-templates select="th|td"/>
        </fo:table-row>
        <!-- Add a spacer/border row: last row rule -->
        <xsl:comment> ::: Table row spacer for last row ::: </xsl:comment>
        <fo:table-row keep-with-previous="always">
            <fo:table-cell padding-after="3pt" number-columns-spanned="{$spacerSpanColumns}">
                <fo:block line-height="1pt">
                    <xsl:comment> Ending border (solid rule) </xsl:comment>
                    <fo:leader xsl:use-attribute-sets="table.body.lastrule"/>
                </fo:block>
            </fo:table-cell>
        </fo:table-row>
    </xsl:template>
    <!-- the table head -->
    <xsl:template match="thead">
        <xsl:param name="spacerSpanColumns">1</xsl:param>
        <!-- Process any tr elements -->
        <xsl:apply-templates select="tr"/>
        <!-- Add a spacer: 4 pt total, 1 pt black line -->
        <xsl:comment> Table heading bottom spacer </xsl:comment>
        <fo:table-row keep-with-previous="always">
            <fo:table-cell padding-after="4.75pt" number-columns-spanned="{$spacerSpanColumns}">
                <fo:block line-height="1pt">
                    <fo:leader xsl:use-attribute-sets="table.heading.rule"/>
                </fo:block>
            </fo:table-cell>
        </fo:table-row>
    </xsl:template>
    <!-- Table heading rows -->
    <xsl:template match="table/tr[1][count(*)=count(th)] | thead/tr">
        <xsl:comment> ::: Table heading row <xsl:value-of select="position()"/> ::: </xsl:comment>
        <fo:table-row xsl:use-attribute-sets="table.title.row">
            <!-- Process any th or td elements -->
            <xsl:apply-templates select="th|td"/>
        </fo:table-row>
    </xsl:template>
    <!-- Table heading cell -->
    <xsl:template match="table/tbody/tr/th | table/tr/th">
        <xsl:comment> : Table subheading cell : </xsl:comment>
        <fo:table-cell xsl:use-attribute-sets="table.subheading.cell">
            <xsl:apply-templates select="@rowspan"/>
            <xsl:apply-templates select="@colspan|@align"/>
            <fo:block xsl:use-attribute-sets="table.subheading.block">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>
    <!-- A heading cell -->
    <xsl:template match="table/tr[1][count(*)=count(th)]/th | table/thead/tr/th | table/thead/tr/td">
        <xsl:comment> : Table heading cell <xsl:value-of select="position()"/> : </xsl:comment>
        <fo:table-cell xsl:use-attribute-sets="table.heading.cell">
            <xsl:if test="@colspan">
                <xsl:attribute name="border-after-style">solid</xsl:attribute>
                <xsl:attribute name="border-after-width">0.75pt</xsl:attribute>
                <xsl:attribute name="border-after-color">black</xsl:attribute>
            </xsl:if>
            <xsl:apply-templates select="@colspan|@rowspan|@align"/>
            <fo:block xsl:use-attribute-sets="table.heading.block">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>
    <!-- A table cell -->
    <xsl:template match="td">
        <xsl:comment> : Table body cell <xsl:value-of select="position()"/> : </xsl:comment>
        <fo:table-cell xsl:use-attribute-sets="table.body.cell">
            <xsl:apply-templates select="@colspan|@align|@rowspan"/>
            <fo:block xsl:use-attribute-sets="table.body.block">
                <xsl:apply-templates/>
            </fo:block>
        </fo:table-cell>
    </xsl:template>
    <!-- align and spanning attributes --> 
    <xsl:template match="@align">
        <xsl:attribute name="text-align"><xsl:value-of select="."/></xsl:attribute>
    </xsl:template>
    <xsl:template match="@colspan">
        <xsl:attribute name="number-columns-spanned"><xsl:value-of select="number(.)"/></xsl:attribute>
    </xsl:template>
    <!-- cell rowspan attribute -->
    <xsl:template match="@rowspan">
        <xsl:attribute name="number-rows-spanned"><xsl:value-of select="number(.) * 2 - 1"/></xsl:attribute>
    </xsl:template>
    <xsl:template match="@rowspan[ancestor::thead]">
        <xsl:attribute name="number-rows-spanned"><xsl:value-of select="number(.)"/></xsl:attribute>
    </xsl:template>
    <!-- html tt tag or code tag in a table -->
    <xsl:template match="tt|code[ancestor::table]">
        <fo:inline xsl:use-attribute-sets="table.pre">
            <xsl:apply-templates/>
        </fo:inline>
    </xsl:template>
</xsl:stylesheet>