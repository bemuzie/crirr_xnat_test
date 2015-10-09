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

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:svg="http://www.w3.org/TR/2001/REC-SVG-20010904" version="1.0">
    <xsl:include href="fo-styles.xslt"/>
    <xsl:include href="fo-layouts.xslt"/>
    <xsl:include href="fo-cover.xslt"/>
    <xsl:include href="fo-toc.xslt"/>
    <xsl:include href="fo-body.xslt"/>
    <xsl:include href="fo-tables.xslt"/>
    <xsl:include href="fo-table-column-widths.xslt"/>
    <xsl:param name="basePath">.</xsl:param>
    <xsl:param name="paperType">US</xsl:param>
    <xsl:param name="companyIncName">Apache Software Foundation, Inc.</xsl:param>
    <xsl:param name="confidential">false</xsl:param>
    <xsl:param name="publicationYear">2003</xsl:param>
    <xsl:param name="imageDpi">150</xsl:param>
    <xsl:param name="companyLogo"/>
    <xsl:param name="projectLogo"/>
    <xsl:param name="coverProjectCompany">Apache Software Foundation</xsl:param>
    <xsl:param name="coverProjectName">Jakarta Maven</xsl:param>
    <xsl:param name="coverType">Project Documentation</xsl:param>
    <xsl:param name="coverVersion">1.0</xsl:param>
    <xsl:param name="coverDate">January 1, 1901</xsl:param>
    <xsl:param name="debug">false</xsl:param>
    <!-- These next two variables are used in cheap-and-cheerful case conversions -->
    <xsl:variable name="lc">abcdefghijklmnopqrstuvwxyz</xsl:variable>
    <xsl:variable name="uc">ABCDEFGHIJKLMNOPQRSTUVWXYZ</xsl:variable>
    <xsl:variable name="footerText">&#169;<xsl:value-of select="$publicationYear"/>
        <xsl:value-of select="concat(' ',$companyIncName)"/> &#8226; All rights reserved<xsl:if test="$confidential = 'true'">&#8226; Proprietary and Confidential</xsl:if>
    </xsl:variable>
    <xsl:variable name="colorDarkGray">#454545</xsl:variable>
    <xsl:variable name="colorMediumGray">#A9A9A9</xsl:variable>
    <xsl:variable name="colorLightGray">#D3D3D3</xsl:variable>
    <xsl:variable name="colorWarmGrey11">#4b4542</xsl:variable>
    <xsl:output method="xml" encoding="UTF-8" indent="yes" omit-xml-declaration="no"/>
    <!-- Templates -->
    <xsl:template match="/">
        <xsl:apply-templates select="project"/>
    </xsl:template>
    <xsl:template match="project">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <xsl:call-template name="fo-layouts"/>
            <xsl:apply-templates/>
        </fo:root>
    </xsl:template>
    <xsl:template match="project/body">
        <xsl:call-template name="fo-cover"/>
        <xsl:call-template name="fo-toc"/>
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="project/body/menu">
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="project/body/menu/item">
        <!-- Renders the xml xdoc document -->
        <xsl:call-template name="render-xdoc">
            <xsl:with-param name="chapterNumber">
                <xsl:number count="menu"/>.<xsl:number count="menu/item"/>
            </xsl:with-param>
        </xsl:call-template>
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="project/body/menu/item/item">
        <!-- Renders the xml xdoc document -->
        <xsl:call-template name="render-xdoc">
            <xsl:with-param name="chapterNumber">
                <xsl:number count="menu"/>.<xsl:number count="menu/item"/>.<xsl:number count="menu/item/item"/>
            </xsl:with-param>
        </xsl:call-template>
        <xsl:apply-templates/>
    </xsl:template>
    <xsl:template match="project/body/menu/item/item/item">
        <!-- Renders the xml xdoc document -->
        <xsl:call-template name="render-xdoc">
            <xsl:with-param name="chapterNumber">
                <xsl:number count="menu"/>.<xsl:number count="menu/item"/>.<xsl:number count="menu/item/item"/>.<xsl:number count="menu/item/item/item"/>
            </xsl:with-param>
        </xsl:call-template>
    </xsl:template>
    <xsl:template name="render-xdoc">
        <xsl:param name="chapterNumber">Foo</xsl:param>
        <!-- Set the page number to start at. Normally this is 'auto'
         unless we are at the very first xdoc, in which case we reset it to 1 -->
        <xsl:variable name="pageStart">
            <xsl:choose>
                <xsl:when test="normalize-space(translate($chapterNumber,'1.','  '))">
                    <xsl:text>auto</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text>1</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <!-- Renders the xml xdoc document -->
        <!-- Retrieve the xdoc file relative to the basePath;
         the name is the href, but substitute .xml as the suffix -->
        <xsl:variable name="href">
            <xsl:choose>
                <!-- If :
			- the href isn't a complete url (http://) 
			- and the href isn't already starting with / -->
                <xsl:when test="not(starts-with(normalize-space(@href),'http')) and not(starts-with(normalize-space(@href),'/'))">
                    <xsl:text>/</xsl:text>
                    <xsl:value-of select="normalize-space(@href)"/>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="normalize-space(@href)"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        <xsl:variable name="documentName" select="substring-before( $href, '.html' )"/>
        <fo:page-sequence master-reference="body" initial-page-number="{$pageStart}">
            <!-- Render the header and footer -->
            <xsl:call-template name="body-header">
                <xsl:with-param name="headerText" select="concat($chapterNumber, '   ', translate(@name, $lc, $uc))"/>
            </xsl:call-template>
            <xsl:call-template name="body-footer">
                <xsl:with-param name="footerText" select="translate($footerText, $lc, $uc)"/>
            </xsl:call-template>
            <fo:flow flow-name="xsl-region-body">
                <!-- Render the chapter heading -->
                <xsl:call-template name="body-chapter-heading">
                    <xsl:with-param name="chapterNumber">
                        <xsl:value-of select="$chapterNumber"/>
                    </xsl:with-param>
                    <xsl:with-param name="chapter">
                        <xsl:value-of select="@name"/>
                    </xsl:with-param>
                </xsl:call-template>
                <!-- Render the associated xdoc -->
                <fo:block id="{@href}{generate-id()}">
                    <xsl:choose>
                        <xsl:when test="not(starts-with($href, 'http'))">
                            <xsl:variable name="documentPath" select="concat(normalize-space($basePath),normalize-space( $documentName), '.xml')"/>
                            <xsl:if test="$debug = 'true'">
                                <xsl:message>Creating XSL:FO for <xsl:value-of select="$documentPath"/>
                                </xsl:message>
                            </xsl:if>
                            <xsl:apply-templates select="document($documentPath)/document/body">
                                <xsl:with-param name="chapterNumber">
                                    <xsl:value-of select="$chapterNumber"/>
                                </xsl:with-param>
                            </xsl:apply-templates>
                        </xsl:when>
                        <xsl:otherwise>
                            <fo:basic-link external-destination="{$href}">
                                <fo:inline xsl:use-attribute-sets="href.external">
                                    <xsl:value-of select="$href"/>
                                </fo:inline>
                            </fo:basic-link>
                        </xsl:otherwise>
                    </xsl:choose>
                </fo:block>
            </fo:flow>
        </fo:page-sequence>
    </xsl:template>
</xsl:stylesheet>
