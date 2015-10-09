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
    <xsl:variable name="colWidth2" select="$maxBodyWidth div 2"/>
    <xsl:variable name="colWidth3" select="$maxBodyWidth div 3"/>
    <xsl:variable name="maxTableHeight" select="$maxBodyHeight - $regionTopMargin"/>
    <xsl:variable name="headerHeight">0.5</xsl:variable>
    <xsl:variable name="footerHeight">0.3</xsl:variable>
    <xsl:variable name="lineHeight">0.014</xsl:variable>
    <xsl:variable name="middleHeight" select="$maxTableHeight - $headerHeight - $footerHeight - $lineHeight - $lineHeight - 0.5"/>
    <xsl:template name="fo-cover">
        <fo:page-sequence master-reference="cover-page">
            <fo:flow flow-name="xsl-region-body">
                <fo:block text-align="center">
                    <fo:table table-layout="fixed">
                        <fo:table-column column-width="{$colWidth2}in"/>
                        <fo:table-column column-width="{$colWidth2}in"/>
                        <fo:table-body>
                            <fo:table-row height="{$headerHeight}in">
                                <fo:table-cell>
                                    <fo:block text-align="left" vertical-align="top">
                                        <xsl:variable name="source">
                                            <xsl:choose>
                                                <xsl:when test="substring(normalize-space($companyLogo),1,3) = '../'">
                                                    <xsl:value-of select="translate(substring-after(normalize-space($companyLogo),'../'),'\','/')"/>
                                                </xsl:when>
                                                <xsl:when test="substring(normalize-space($companyLogo),1,3) = '..\'">
                                                    <xsl:value-of select="translate(substring-after(normalize-space($companyLogo),'..\'),'\','/')"/>
                                                </xsl:when>
                                                <xsl:otherwise>
                                                    <xsl:value-of select="normalize-space($companyLogo)"/>
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </xsl:variable>
                                        <fo:external-graphic src="{$source}" height="{$headerHeight}in" width="auto" content-height="{$headerHeight}in" content-width="auto"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block text-align="right" vertical-align="top">
                                        <xsl:variable name="source">
                                            <xsl:choose>
                                                <xsl:when test="substring(normalize-space($projectLogo),1,3) = '../'">
                                                    <xsl:value-of select="translate(substring-after(normalize-space($projectLogo),'../'),'\','/')"/>
                                                </xsl:when>
                                                <xsl:when test="substring(normalize-space($companyLogo),1,3) = '..\'">
                                                    <xsl:value-of select="translate(substring-after(normalize-space($projectLogo),'..\'),'\','/')"/>
                                                </xsl:when>
                                                <xsl:otherwise>
                                                    <xsl:value-of select="normalize-space($projectLogo)"/>
                                                </xsl:otherwise>
                                            </xsl:choose>
                                        </xsl:variable>
                                        <fo:external-graphic src="{$source}" height="{$headerHeight}in" width="auto" content-height="{$headerHeight}in" content-width="auto"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row keep-with-previous="always" height="{$lineHeight}in">
                                <fo:table-cell number-columns-spanned="2">
                                    <fo:block line-height="{$lineHeight}in">
                                        <fo:leader xsl:use-attribute-sets="chapter.rule"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row height="{$middleHeight}in">
                                <fo:table-cell number-columns-spanned="3">
                                    <fo:table table-layout="fixed">
                                        <fo:table-column column-width="{$colWidth3}in"/>
                                        <fo:table-column column-width="{$colWidth3}in"/>
                                        <fo:table-column column-width="{$colWidth3}in"/>
                                        <fo:table-body>
                                            <fo:table-row>
                                                <fo:table-cell number-columns-spanned="2">
                                                    <fo:block space-before="{($middleHeight - 1) div 2}in">
                                                    </fo:block>
                                                </fo:table-cell>
                                            </fo:table-row>
                                            <fo:table-row>
                                                <fo:table-cell>
                                                    <fo:block space-after="0.5in"/>
                                                </fo:table-cell>
                                                <fo:table-cell number-columns-spanned="2" xsl:use-attribute-sets="cover.border.left">
                                                    <fo:block xsl:use-attribute-sets="cover.title" text-align="left" display-align="center" space-after="0.5in">
                                                        <xsl:value-of select="$coverProjectName"/> 
                                                        <xsl:if test="normalize-space($coverVersion) != ''">
                                                                v.<xsl:value-of select="$coverVersion"/>
                                                        </xsl:if>
                                                    </fo:block>
                                                </fo:table-cell>
                                            </fo:table-row>
                                            <fo:table-row>
                                                <fo:table-cell>
                                                    <fo:block/>
                                                </fo:table-cell>
                                                <fo:table-cell number-columns-spanned="2" xsl:use-attribute-sets="cover.border.left.bottom">
                                                    <fo:block xsl:use-attribute-sets="cover.subtitle" text-align="left" display-align="center">
                                                        <xsl:value-of select="$coverType"/>
                                                    </fo:block>
                                                </fo:table-cell>
                                            </fo:table-row>
                                        </fo:table-body>
                                    </fo:table>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row height="{$lineHeight}in">
                                <fo:table-cell number-columns-spanned="2">
                                    <fo:block line-height="{$lineHeight}in" space-after="0.2in">
                                        <fo:leader xsl:use-attribute-sets="chapter.rule"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                            <fo:table-row height="{$footerHeight}in">
                                <fo:table-cell>
                                    <fo:block xsl:use-attribute-sets="cover.subtitle" text-align="left" height="{$footerHeight}in">
                                        <xsl:value-of select="$coverProjectCompany"/>
                                    </fo:block>
                                </fo:table-cell>
                                <fo:table-cell>
                                    <fo:block xsl:use-attribute-sets="cover.subtitle" text-align="right" height="{$footerHeight}in">
                                        <xsl:value-of select="$coverDate"/>
                                    </fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                </fo:block>
            </fo:flow>
        </fo:page-sequence>
    </xsl:template>
</xsl:stylesheet>
