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
    <!-- Set the default page width, in inches -->
    <xsl:variable name="pageWidth">
        <xsl:choose>
            <xsl:when test="$paperType = 'US'">8.5</xsl:when>
            <xsl:when test="$paperType = 'USLetter'">8.5</xsl:when>
            <xsl:when test="$paperType = 'A4'">8.25</xsl:when>
            <xsl:otherwise>8.5</xsl:otherwise>
        </xsl:choose>
    </xsl:variable>
    <!-- Set the default page height, in inches -->
    <xsl:variable name="pageHeight">
        <xsl:choose>
            <xsl:when test="$paperType = 'US'">14</xsl:when>
            <xsl:when test="$paperType = 'USLetter'">11</xsl:when>
            <xsl:when test="$paperType = 'A4'">11.70</xsl:when>
            <xsl:otherwise>14</xsl:otherwise>
        </xsl:choose>
    </xsl:variable>
    <!-- Set the max table width -->
    <xsl:variable name="maxTableWidth" select="$maxBodyWidth"/>
    <!-- Set the default left and right margin, in inches -->
    <xsl:variable name="bodySideMargins">1</xsl:variable>
    <xsl:variable name="maxBodyWidth" select="$pageWidth - (2 * $bodySideMargins)"/>
    <!-- Set the default top and bottom margin, in inches -->
    <xsl:variable name="bodyTopMargin">0.625</xsl:variable>
    <xsl:variable name="bodyBottomMargin">0.6</xsl:variable>
    <xsl:variable name="maxBodyHeight" select="$pageHeight - $bodyTopMargin - $bodyBottomMargin"/>
    <xsl:variable name="regionTopMargin">0.7</xsl:variable>
    <xsl:variable name="regionBottomMargin">0.8</xsl:variable>
    <xsl:template name="fo-layouts">
        <!-- Defines the layout set -->
        <fo:layout-master-set>
            <fo:simple-page-master master-name="cover-page" page-width="{$pageWidth}in" page-height="{$pageHeight}in" margin-top="{$bodyTopMargin}in" margin-bottom="{$bodyBottomMargin}in" margin-left="{$bodySideMargins}in" margin-right="{$bodySideMargins}in">
                <fo:region-body margin-top="{$regionTopMargin}in"/>
            </fo:simple-page-master>
            <fo:simple-page-master master-name="cover-inside" page-width="{$pageWidth}in" page-height="{$pageHeight}in" margin-top="0in" margin-bottom="0in" margin-left="0in" margin-right="0in">
                <fo:region-body margin-top="0in"/>
            </fo:simple-page-master>
            <fo:simple-page-master master-name="toc" page-width="{$pageWidth}in" page-height="{$pageHeight}in" margin-top="{$bodyTopMargin}in" margin-bottom="{$bodyBottomMargin}in" margin-left="{$bodySideMargins}in" margin-right="{$bodySideMargins}in">
                <fo:region-before extent="0.35in"/>
                <fo:region-body margin-top="{$regionTopMargin}in" margin-bottom="{$regionBottomMargin}in"/>
                <fo:region-after extent="0.125in"/>
            </fo:simple-page-master>
            <fo:simple-page-master master-name="body" page-width="{$pageWidth}in" page-height="{$pageHeight}in" margin-top="{$bodyTopMargin}in" margin-bottom="{$bodyBottomMargin}in" margin-left="{$bodySideMargins}in" margin-right="{$bodySideMargins}in">
                <fo:region-before extent="0.35in"/>
                <fo:region-body margin-top="{$regionTopMargin}in" margin-bottom="{$regionBottomMargin}in"/>
                <fo:region-after extent="0.125in"/>
            </fo:simple-page-master>
        </fo:layout-master-set>
    </xsl:template>
</xsl:stylesheet>
