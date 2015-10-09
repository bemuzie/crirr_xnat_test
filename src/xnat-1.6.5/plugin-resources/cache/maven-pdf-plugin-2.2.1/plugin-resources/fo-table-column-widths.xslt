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
    <!-- This is a dummy entry -->
    <xsl:variable name="masklookup">----------111111111122222222223333333333444444444455555555556666666666777777777788888888889999999999"</xsl:variable>
    <xsl:variable name="columnWidths">  5?  5?  5?  5?  5?  5?  5?  5?  5?  5?</xsl:variable>
    <xsl:template name="calculate-column-widths">
        <xsl:param name="row">1</xsl:param>
        <xsl:param name="col">1</xsl:param>
        <xsl:param name="mask"> ----------</xsl:param>
        <xsl:param name="nextmask"> ----------</xsl:param>
        <xsl:param name="widths" select="$columnWidths"/>
        <!-- Get current row and column based on (row,col) parameters -->
        <xsl:variable name="currentRow" select="thead/tr[position()=$row]"/>
        <xsl:variable name="currentCol" select="thead/tr[position()=$row]/th[position()=$col]"/>
        <!-- Determine the row/colspans for the current cell
         If not specified, they default to 1 -->
        <xsl:variable name="colspan">
            <xsl:choose>
                <xsl:when test="$currentCol/@colspan">
                    <xsl:value-of select="$currentCol/@colspan"/>
                </xsl:when>
                <xsl:otherwise>1</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="rowspan">
            <xsl:choose>
                <xsl:when test="$currentCol/@rowspan">
                    <xsl:value-of select="$currentCol/@rowspan"/>
                </xsl:when>
                <xsl:otherwise>1</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Based on the current row mask, determine where to insert the current cell mask -->
        <xsl:variable name="insmask-row">
            <xsl:value-of select="substring($masklookup, $rowspan *10+1, $colspan)"/>
        </xsl:variable>
        <xsl:variable name="insmask-nextrow">
            <xsl:value-of select="substring($masklookup, ($rowspan - 1)*10+1, $colspan)"/>
        </xsl:variable>
        <xsl:variable name="ins">
            <xsl:value-of select="string-length(substring-before($mask,'-')) + 1"/>
        </xsl:variable>
        <!-- If this cell has a width attribute, extract it and normalize to one column.
         Also, pad it to three characters wide. If the current column is more than one
         column wide, append the padded width with a '?' so that it can be overridden. -->
        <xsl:variable name="cellwidthRaw">
            <xsl:choose>
                <xsl:when test="$currentCol/@width">
                    <xsl:if test="contains($currentCol/@width,'%')">
                        <xsl:value-of select="substring-before($currentCol/@width,'%') div $colspan"/>
                    </xsl:if>
                </xsl:when>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="cellwidth">
            <xsl:if test="$cellwidthRaw &gt; 0">
                <xsl:choose>
                    <xsl:when test="$colspan = 1">
                        <xsl:value-of select="concat(substring('   ', 1, 3 - string-length(round($cellwidthRaw))), round($cellwidthRaw), ' ')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="concat(substring('   ', 1, 3 - string-length(round($cellwidthRaw))), round($cellwidthRaw), '?')"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:if>
        </xsl:variable>
        <!-- Create a width 'mask' that repeats the width string i times, where i is the
         number of columns spanned -->
        <xsl:variable name="cellwidthmaskRaw">
            <xsl:value-of select="translate('abcdabcdabcdabcdabcdabcdabcdabcdabcdabcd', 'abcd',$cellwidth)"/>
        </xsl:variable>
        <xsl:variable name="cellwidthmask">
            <xsl:value-of select="substring($cellwidthmaskRaw, 1, $colspan * 4)"/>
        </xsl:variable>
        <!-- Insert the cell width, if supplied, into the registry -->
        <xsl:variable name="widths2">
            <xsl:choose>
                <xsl:when test="$cellwidthRaw &gt; 0 and substring($widths, ($ins - 2)*4+4, 1) = '?'">
                    <xsl:value-of select="concat(substring($widths, 1, ($ins - 2)*4),
                                       $cellwidthmask,
                                       substring($widths, ($ins - 2 + $colspan)*4+1))"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$widths"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Revise the the current row's mask by inserting
         a digit j (repeated k times) into the first available space in the
         mask. J represents the number of rowspans for the current cell
         the supplied masks. We insert the same number of j into the next row's
         mask also. -->
        <xsl:variable name="mask2">
            <xsl:value-of select="concat(substring($mask, 1, $ins - 1),
                                   $insmask-row,
                                   substring($mask, $ins + $colspan))"/>
        </xsl:variable>
        <xsl:variable name="nextmask2">
            <xsl:value-of select="concat(substring($nextmask, 1, $ins - 1),
                                   $insmask-nextrow,
                                   substring($nextmask, $ins + $colspan))"/>
        </xsl:variable>
        <!-- Print debugging information -->
        <xsl:if test="$debug = 'true'">
            <xsl:message>Cell (<xsl:value-of select="$row"/>,<xsl:value-of select="$col"/>)  text()='<xsl:value-of select="normalize-space($currentCol)"/>' rowspan=<xsl:value-of select="$rowspan"/> colspan=<xsl:value-of select="$colspan"/> width=<xsl:value-of select="normalize-space($cellwidthRaw * $colspan)"/>
            </xsl:message>
            <xsl:message>  Current cell mask    : <xsl:value-of select="$mask"/>in <xsl:value-of select="$mask2"/>out</xsl:message>
            <xsl:message>  Next row mask        : <xsl:value-of select="$nextmask"/>in <xsl:value-of select="$nextmask2"/>out</xsl:message>
            <xsl:message>  Estimated cell widths: <xsl:value-of select="$cellwidthmask"/>
            </xsl:message>
            <xsl:message>  Cell widths so far   : <xsl:value-of select="$widths2"/>
            </xsl:message>
        </xsl:if>
        <!-- What to do next? -->
        <xsl:choose>
            <xsl:when test="thead/tr[position()=$row]/th[position()=$col+1]">
                <xsl:call-template name="calculate-column-widths">
                    <xsl:with-param name="row" select="$row"/>
                    <xsl:with-param name="col" select="$col+1"/>
                    <xsl:with-param name="mask" select="$mask2"/>
                    <xsl:with-param name="nextmask" select="$nextmask2"/>
                    <xsl:with-param name="widths" select="$widths2"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="thead/tr[position()=$row+1]">
                        <xsl:call-template name="calculate-column-widths">
                            <xsl:with-param name="row" select="$row+1"/>
                            <xsl:with-param name="col" select="1"/>
                            <xsl:with-param name="mask" select="translate($mask2, '123456789', '-12345678')"/>
                            <xsl:with-param name="widths" select="$widths2"/>
                        </xsl:call-template>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:call-template name="totals">
                            <xsl:with-param name="columns" select="string-length(substring-before(concat($mask2,'-'),'-'))-1"/>
                            <xsl:with-param name="widths" select="$widths2"/>
                        </xsl:call-template>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <xsl:template name="totals">
        <xsl:param name="col">1</xsl:param>
        <xsl:param name="columns">1</xsl:param>
        <xsl:param name="widths">  1?</xsl:param>
        <xsl:param name="sumwidths">0</xsl:param>
        <xsl:param name="softColumns">0</xsl:param>
        <xsl:variable name="colwidth" select="substring($widths, ($col - 1)*4+1 , 3)"/>
        <!-- If we find something ('?') in the 4th position, it's a soft column -->
        <xsl:variable name="softColumn">
            <xsl:choose>
                <xsl:when test="normalize-space(substring($widths, ($col - 1)*4+4, 1))">1</xsl:when>
                <xsl:otherwise>0</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="leftover">
            <xsl:choose>
                <xsl:when test="$sumwidths &gt; 100">
                    <xsl:value-of select="0"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="100 - $sumwidths"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <xsl:choose>
            <xsl:when test="$col &lt;= $columns">
                <xsl:call-template name="totals">
                    <xsl:with-param name="col" select="$col + 1"/>
                    <xsl:with-param name="columns" select="$columns"/>
                    <xsl:with-param name="widths" select="$widths"/>
                    <xsl:with-param name="sumwidths" select="$sumwidths + $colwidth"/>
                    <xsl:with-param name="softColumns" select="$softColumns + $softColumn"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:if test="$debug = 'true'">
                    <xsl:message>Columns= <xsl:value-of select="$columns"/> (<xsl:value-of select="$softColumns"/> resizable), width=<xsl:value-of select="$sumwidths"/>, leftover=<xsl:value-of select="$leftover"/>
                    </xsl:message>
                </xsl:if>
                <xsl:call-template name="print-columns">
                    <xsl:with-param name="columns" select="$columns"/>
                    <xsl:with-param name="widths" select="$widths"/>
                    <xsl:with-param name="sumwidths" select="$sumwidths + $leftover"/>
                    <xsl:with-param name="adjust" select="$leftover div $softColumns"/>
                    <xsl:with-param name="softColumns" select="$softColumns"/>
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    <xsl:template name="print-columns">
        <xsl:param name="col">1</xsl:param>
        <xsl:param name="columns">1</xsl:param>
        <xsl:param name="widths">  1?</xsl:param>
        <xsl:param name="sumwidths">0</xsl:param>
        <xsl:param name="adjust">0</xsl:param>
        <xsl:param name="softColumns">1</xsl:param>
        <xsl:variable name="colwidth" select="substring($widths, ($col - 1)*4+1 , 3)"/>
        <xsl:variable name="colwidth2">
            <xsl:choose>
                <xsl:when test="normalize-space(substring($widths, ($col - 1)*4+4, 1))">
                    <xsl:value-of select="$colwidth + $adjust"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$colwidth"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- And now, the moment we've all been waiting for -->
        <fo:table-column>
            <xsl:attribute name="column-width"><xsl:value-of select="$colwidth2 div $sumwidths * $maxTableWidth"/>in
      </xsl:attribute>
        </fo:table-column>
        <!-- Loop to the next column -->
        <xsl:choose>
            <xsl:when test="$col &lt; $columns">
                <xsl:call-template name="print-columns">
                    <xsl:with-param name="col" select="$col + 1"/>
                    <xsl:with-param name="columns" select="$columns"/>
                    <xsl:with-param name="widths" select="$widths"/>
                    <xsl:with-param name="sumwidths" select="$sumwidths"/>
                    <xsl:with-param name="adjust" select="$adjust"/>
                    <xsl:with-param name="softColumns" select="$softColumns"/>
                </xsl:call-template>
            </xsl:when>
        </xsl:choose>
    </xsl:template>
    <!-- Calculate column widths for tables without thead -->
    <xsl:template name="html-calculate-column-widths">
        <xsl:param name="row">1</xsl:param>
        <xsl:param name="col">1</xsl:param>
        <xsl:param name="mask"> ----------</xsl:param>
        <xsl:param name="nextmask"> ----------</xsl:param>
        <xsl:param name="widths" select="$columnWidths"/>
        <!-- Get current row and column based on (row,col) parameters -->
        <xsl:variable name="currentRow" select="tr[position()=$row]"/>
        <xsl:variable name="currentCol" select="tr[position()=$row]/th[position()=$col]|tr[position()=$row]/td[position()=$col]"/>
        <!-- Determine the row/colspans for the current cell
         If not specified, they default to 1 -->
        <xsl:variable name="colspan">
            <xsl:choose>
                <xsl:when test="$currentCol/@colspan">
                    <xsl:value-of select="$currentCol/@colspan"/>
                </xsl:when>
                <xsl:otherwise>1</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="rowspan">
            <xsl:choose>
                <xsl:when test="$currentCol/@rowspan">
                    <xsl:value-of select="$currentCol/@rowspan"/>
                </xsl:when>
                <xsl:otherwise>1</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Based on the current row mask, determine where to insert the current cell mask -->
        <xsl:variable name="insmask-row">
            <xsl:value-of select="substring($masklookup, $rowspan *10+1, $colspan)"/>
        </xsl:variable>
        <xsl:variable name="insmask-nextrow">
            <xsl:value-of select="substring($masklookup, ($rowspan - 1)*10+1, $colspan)"/>
        </xsl:variable>
        <xsl:variable name="ins">
            <xsl:value-of select="string-length(substring-before($mask,'-')) + 1"/>
        </xsl:variable>
        <!-- If this cell has a width attribute, extract it and normalize to one column.
         Also, pad it to three characters wide. If the current column is more than one
         column wide, append the padded width with a '?' so that it can be overridden. -->
        <xsl:variable name="cellwidthRaw">
            <xsl:choose>
                <xsl:when test="$currentCol/@width">
                    <xsl:if test="contains($currentCol/@width,'%')">
                        <xsl:value-of select="substring-before($currentCol/@width,'%') div $colspan"/>
                    </xsl:if>
                </xsl:when>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="cellwidth">
            <xsl:if test="$cellwidthRaw &gt; 0">
                <xsl:choose>
                    <xsl:when test="$colspan = 1">
                        <xsl:value-of select="concat(substring('   ', 1, 3 - string-length(round($cellwidthRaw))), round($cellwidthRaw), ' ')"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="concat(substring('   ', 1, 3 - string-length(round($cellwidthRaw))), round($cellwidthRaw), '?')"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:if>
        </xsl:variable>
        <!-- Create a width 'mask' that repeats the width string i times, where i is the
         number of columns spanned -->
        <xsl:variable name="cellwidthmaskRaw">
            <xsl:value-of select="translate('abcdabcdabcdabcdabcdabcdabcdabcdabcdabcd', 'abcd',$cellwidth)"/>
        </xsl:variable>
        <xsl:variable name="cellwidthmask">
            <xsl:value-of select="substring($cellwidthmaskRaw, 1, $colspan * 4)"/>
        </xsl:variable>
        <!-- Insert the cell width, if supplied, into the registry -->
        <xsl:variable name="widths2">
            <xsl:choose>
                <xsl:when test="$cellwidthRaw &gt; 0 and substring($widths, ($ins - 2)*4+4, 1) = '?'">
                    <xsl:value-of select="concat(substring($widths, 1, ($ins - 2)*4),
                                       $cellwidthmask,
                                       substring($widths, ($ins - 2 + $colspan)*4+1))"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$widths"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Revise the the current row's mask by inserting
         a digit j (repeated k times) into the first available space in the
         mask. J represents the number of rowspans for the current cell
         the supplied masks. We insert the same number of j into the next row's
         mask also. -->
        <xsl:variable name="mask2">
            <xsl:value-of select="concat(substring($mask, 1, $ins - 1),
                                   $insmask-row,
                                   substring($mask, $ins + $colspan))"/>
        </xsl:variable>
        <xsl:variable name="nextmask2">
            <xsl:value-of select="concat(substring($nextmask, 1, $ins - 1),
                                   $insmask-nextrow,
                                   substring($nextmask, $ins + $colspan))"/>
        </xsl:variable>
        <!-- Print debugging information -->
        <xsl:if test="$debug = 'true'">
            <xsl:message>Cell (<xsl:value-of select="$row"/>,<xsl:value-of select="$col"/>)  text()='<xsl:value-of select="normalize-space($currentCol)"/>' rowspan=<xsl:value-of select="$rowspan"/> colspan=<xsl:value-of select="$colspan"/> width=<xsl:value-of select="normalize-space($cellwidthRaw * $colspan)"/>
            </xsl:message>
            <xsl:message>  Current cell mask    : <xsl:value-of select="$mask"/>in <xsl:value-of select="$mask2"/>out</xsl:message>
            <xsl:message>  Next row mask        : <xsl:value-of select="$nextmask"/>in <xsl:value-of select="$nextmask2"/>out</xsl:message>
            <xsl:message>  Estimated cell widths: <xsl:value-of select="$cellwidthmask"/>
            </xsl:message>
            <xsl:message>  Cell widths so far   : <xsl:value-of select="$widths2"/>
            </xsl:message>
        </xsl:if>
        <!-- What to do next? -->
        <xsl:choose>
            <xsl:when test="tr[position()=$row]/th[position()=$col+1]|tr[position()=$row]/td[position()=$col+1]">
                <xsl:call-template name="html-calculate-column-widths">
                    <xsl:with-param name="row" select="$row"/>
                    <xsl:with-param name="col" select="$col+1"/>
                    <xsl:with-param name="mask" select="$mask2"/>
                    <xsl:with-param name="nextmask" select="$nextmask2"/>
                    <xsl:with-param name="widths" select="$widths2"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="tr[position()=$row+1]">
                        <xsl:call-template name="html-calculate-column-widths">
                            <xsl:with-param name="row" select="$row+1"/>
                            <xsl:with-param name="col" select="1"/>
                            <xsl:with-param name="mask" select="translate($mask2, '123456789', '-12345678')"/>
                            <xsl:with-param name="widths" select="$widths2"/>
                        </xsl:call-template>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:call-template name="totals">
                            <xsl:with-param name="columns" select="string-length(substring-before(concat($mask2,'-'),'-'))-1"/>
                            <xsl:with-param name="widths" select="$widths2"/>
                        </xsl:call-template>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
</xsl:stylesheet>
