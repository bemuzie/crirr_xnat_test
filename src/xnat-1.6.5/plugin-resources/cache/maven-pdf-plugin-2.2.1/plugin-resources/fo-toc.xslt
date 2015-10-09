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
    <!-- Templates for handling the TOC -->
    <xsl:template name="fo-toc">
        <fo:page-sequence master-reference="toc" initial-page-number="1" format="i">
            <!-- Render the header and footer -->
            <xsl:call-template name="body-header">
                <xsl:with-param name="headerText" select="translate('Table of Contents', $lc, $uc)"/>
            </xsl:call-template>
            <xsl:call-template name="body-footer">
                <xsl:with-param name="footerText" select="translate($footerText, $lc, $uc)"/>
            </xsl:call-template>
            <fo:flow flow-name="xsl-region-body">
                <!-- Render the chapter heading -->
                <xsl:call-template name="body-chapter-heading">
                    <xsl:with-param name="chapterNumber"/>
                    <xsl:with-param name="chapter">Table of Contents</xsl:with-param>
                </xsl:call-template>
                <fo:table table-layout="fixed">
                    <fo:table-column column-width="0.25in"/>
                    <fo:table-column column-width="0.4in"/>
                    <fo:table-column column-width="0.4in"/>
                    <fo:table-column column-width="{$maxBodyWidth - 1.25}in"/>
                    <fo:table-body>
                        <xsl:apply-templates mode="toc"/>
                    </fo:table-body>
                </fo:table>
            </fo:flow>
        </fo:page-sequence>
    </xsl:template>
    <xsl:template match="project/body/menu" mode="toc">
        <fo:table-row keep-with-next="always">
            <fo:table-cell xsl:use-attribute-sets="toc.cell">
                <fo:block xsl:use-attribute-sets="toc.number.style">
                    <xsl:number level="any" format="1" count="menu"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell xsl:use-attribute-sets="toc.cell" number-columns-spanned="3">
                <xsl:choose>
                    <xsl:when test="normalize-space(@href)">
                        <fo:block xsl:use-attribute-sets="toc.h1.style" text-align-last="justify">
                            <fo:basic-link internal-destination="{@href}{generate-id()}">
                                <xsl:apply-templates select="@name"/>
                            </fo:basic-link>
                            <fo:leader xsl:use-attribute-sets="toc.leader.style"/>
                            <fo:inline xsl:use-attribute-sets="page.number">
                                <fo:page-number-citation ref-id="{@href}{generate-id()}"/>
                            </fo:inline>
                        </fo:block>
                    </xsl:when>
                    <xsl:otherwise>
                        <fo:block xsl:use-attribute-sets="toc.h1.style">
                            <xsl:apply-templates select="@name"/>
                        </fo:block>
                    </xsl:otherwise>
                </xsl:choose>
            </fo:table-cell>
        </fo:table-row>
        <xsl:apply-templates mode="toc"/>
    </xsl:template>
    <xsl:template match="project/body/menu/item" mode="toc">
        <fo:table-row keep-with-next="always">
            <fo:table-cell xsl:use-attribute-sets="toc.cell">
                <fo:block xsl:use-attribute-sets="toc.number.style">
                    <xsl:number count="menu"/>.<xsl:number count="menu/item"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell xsl:use-attribute-sets="toc.cell" number-columns-spanned="3">
                <xsl:choose>
                    <xsl:when test="normalize-space(@href)">
                        <fo:block xsl:use-attribute-sets="toc.h2.style" text-align-last="justify">
                            <fo:basic-link internal-destination="{@href}{generate-id()}">
                                <xsl:apply-templates select="@name"/>
                            </fo:basic-link>
                            <fo:leader xsl:use-attribute-sets="toc.leader.style"/>
                            <fo:inline xsl:use-attribute-sets="page.number">
                                <fo:page-number-citation ref-id="{@href}{generate-id()}"/>
                            </fo:inline>
                        </fo:block>
                    </xsl:when>
                    <xsl:otherwise>
                        <fo:block xsl:use-attribute-sets="toc.h2.style">
                            <xsl:apply-templates select="@name"/>
                        </fo:block>
                    </xsl:otherwise>
                </xsl:choose>
            </fo:table-cell>
        </fo:table-row>
        <xsl:apply-templates mode="toc"/>
    </xsl:template>
    <xsl:template match="project/body/menu/item/item" mode="toc">
        <fo:table-row>
            <fo:table-cell/>
            <fo:table-cell xsl:use-attribute-sets="toc.cell">
                <fo:block xsl:use-attribute-sets="toc.number.style">
                    <xsl:number count="menu"/>.<xsl:number count="menu/item"/>.<xsl:number count="menu/item/item"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell xsl:use-attribute-sets="toc.cell" number-columns-spanned="2">
                <xsl:choose>
                    <xsl:when test="normalize-space(@href)">
                        <fo:block xsl:use-attribute-sets="toc.h3.style" text-align-last="justify">
                            <fo:basic-link internal-destination="{@href}{generate-id()}">
                                <xsl:apply-templates select="@name"/>
                            </fo:basic-link>
                            <fo:leader xsl:use-attribute-sets="toc.leader.style"/>
                            <fo:inline xsl:use-attribute-sets="page.number">
                                <fo:page-number-citation ref-id="{@href}{generate-id()}"/>
                            </fo:inline>
                        </fo:block>
                    </xsl:when>
                    <xsl:otherwise>
                        <fo:block xsl:use-attribute-sets="toc.h3.style">
                            <xsl:apply-templates select="@name"/>
                        </fo:block>
                    </xsl:otherwise>
                </xsl:choose>
            </fo:table-cell>
        </fo:table-row>
        <xsl:apply-templates mode="toc"/>
    </xsl:template>
    <xsl:template match="project/body/menu/item/item/item" mode="toc">
        <fo:table-row>
            <fo:table-cell/>
            <fo:table-cell/>
            <fo:table-cell xsl:use-attribute-sets="toc.cell">
                <fo:block xsl:use-attribute-sets="toc.number.style">
                    <xsl:number count="menu"/>.<xsl:number count="menu/item"/>.<xsl:number count="menu/item/item"/>.<xsl:number count="menu/item/item/item"/>
                </fo:block>
            </fo:table-cell>
            <fo:table-cell xsl:use-attribute-sets="toc.cell">
                <xsl:choose>
                    <xsl:when test="normalize-space(@href)">
                        <fo:block xsl:use-attribute-sets="toc.h3.style" text-align-last="justify">
                            <fo:basic-link internal-destination="{@href}{generate-id()}">
                                <xsl:apply-templates select="@name"/>
                            </fo:basic-link>
                            <fo:leader xsl:use-attribute-sets="toc.leader.style"/>
                            <fo:inline xsl:use-attribute-sets="page.number">
                                <fo:page-number-citation ref-id="{@href}{generate-id()}"/>
                            </fo:inline>
                        </fo:block>
                    </xsl:when>
                    <xsl:otherwise>
                        <fo:block xsl:use-attribute-sets="toc.h3.style">
                            <xsl:apply-templates select="@name"/>
                        </fo:block>
                    </xsl:otherwise>
                </xsl:choose>
            </fo:table-cell>
        </fo:table-row>
        <xsl:apply-templates mode="toc"/>
    </xsl:template>
</xsl:stylesheet>
