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
  <!-- Templates for rendering headers, footers, and chapter headings -->
  <xsl:template name="body-header">
    <xsl:param name="headerText"/>
    <xsl:param name="pageNumber"/>
    <xsl:variable name="leftCol" select="0.9 * $maxBodyWidth"/>
    <xsl:variable name="rightCol" select="0.1 * $maxBodyWidth"/>
    <fo:static-content flow-name="xsl-region-before">
      <fo:table table-layout="fixed">
        <fo:table-column column-width="{$leftCol}in"/>
        <fo:table-column column-width="{$rightCol}in"/>
        <fo:table-body>
          <fo:table-row>
            <fo:table-cell>
              <fo:block xsl:use-attribute-sets="header.style">
                <xsl:value-of select="normalize-space($headerText)"/>
              </fo:block>
            </fo:table-cell>
            <fo:table-cell>
              <fo:block xsl:use-attribute-sets="page.number">
                <fo:page-number/>
              </fo:block>
            </fo:table-cell>
          </fo:table-row>
        </fo:table-body>
      </fo:table>
    </fo:static-content>
  </xsl:template>
  <xsl:template name="body-footer">
    <xsl:param name="footerText"/>
    <fo:static-content flow-name="xsl-region-after">
      <fo:block xsl:use-attribute-sets="footer.style">
        <xsl:value-of select="normalize-space($footerText)"/>
      </fo:block>
    </fo:static-content>
  </xsl:template>
  <xsl:template name="body-chapter-heading">
    <xsl:param name="chapterNumber"/>
    <xsl:param name="chapter"/>
    <xsl:variable name="gutter">0.125</xsl:variable>
    <xsl:variable name="leftMargin">
      <xsl:value-of select="$bodySideMargins"/>
    </xsl:variable>
    <xsl:variable name="rightMargin">
      <xsl:value-of select="$bodySideMargins"/>
    </xsl:variable>
    <xsl:variable name="bodyWidth">
      <xsl:value-of select="$maxBodyWidth"/>
    </xsl:variable>
    <fo:block>
      <fo:list-block provisional-distance-between-starts="{$leftMargin}in" provisional-label-separation="{$gutter}in">
        <fo:list-item>
          <fo:list-item-label end-indent="{$bodyWidth + $gutter}in">
            <fo:block xsl:use-attribute-sets="outdented.number.style">
              <xsl:value-of select="normalize-space($chapterNumber)"/>
            </fo:block>
          </fo:list-item-label>
          <fo:list-item-body>
            <fo:block xsl:use-attribute-sets="chapter.title">
              <xsl:value-of select="normalize-space($chapter)"/>
            </fo:block>
          </fo:list-item-body>
        </fo:list-item>
      </fo:list-block>
    </fo:block>
    <fo:block space-after.optimum="5em">
      <!-- Add a rule underneath -->
      <fo:leader xsl:use-attribute-sets="chapter.rule"/>
    </fo:block>
  </xsl:template>
  <!-- Templates for rendering xdoc tags -->
  <xsl:template match="document/body">
    <xsl:param name="chapterNumber"/>
    <xsl:apply-templates>
      <xsl:with-param name="chapterNumber">
        <xsl:value-of select="$chapterNumber"/>
      </xsl:with-param>
    </xsl:apply-templates>
  </xsl:template>
  <xsl:template match="section">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.h1">
      <xsl:value-of select="@name"/>
    </fo:block>
    <fo:block xsl:use-attribute-sets="body.text">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="subsection">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.h2">
      <xsl:value-of select="@name"/>
    </fo:block>
    <fo:block xsl:use-attribute-sets="body.text">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="p[@style='h3']">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.h3">
      <xsl:value-of select="normalize-space(.)"/>
    </fo:block>
  </xsl:template>
  <xsl:template match="p[@style='h4']">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.h4">
      <xsl:value-of select="normalize-space(.)"/>
    </fo:block>
  </xsl:template>
  <xsl:template match="p[@style='h5']">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.h5">
      <xsl:value-of select="normalize-space(.)"/>
    </fo:block>
  </xsl:template>
  <xsl:template match="p">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.text normal.paragraph">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="source">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.source">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="pre">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="body.source">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="img[@src]">
    <xsl:variable name="source">
      <xsl:choose>
        <xsl:when test="substring(normalize-space(@src),1,3) = '../'">
          <xsl:value-of select="translate(substring-after(normalize-space(@src),'../'),'\','/')"/>
        </xsl:when>
        <xsl:when test="substring(normalize-space(@src),1,3) = '..\'">
          <xsl:value-of select="translate(substring-after(normalize-space(@src),'..\'),'\','/')"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="@src"/>
        </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="width">
      <xsl:value-of select="substring-before(concat(normalize-space(@width),'p'),'p') div $imageDpi"/>
    </xsl:variable>
    <xsl:variable name="height">
      <xsl:value-of select="substring-before(concat(normalize-space(@height),'p'),'p') div $imageDpi"/>
    </xsl:variable>
    <xsl:variable name="realwidth">
      <xsl:choose>
        <xsl:when test="normalize-space($width) = 'NaN'">
          <xsl:value-of select="'auto'"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$width"/>in
                </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="realheight">
      <xsl:choose>
        <xsl:when test="normalize-space($height) = 'NaN'">
          <xsl:value-of select="'auto'"/>
        </xsl:when>
        <xsl:otherwise>
          <xsl:value-of select="$height"/>in
                </xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <!-- Enclose image in a block if parent is a section or subsection element -->
    <xsl:choose>
      <xsl:when test="parent::section | parent::subsection">
        <fo:block>
          <fo:external-graphic src="{normalize-space($source)}" height="{$realheight}" width="{$realwidth}" content-height="auto" content-width="auto"/>
        </fo:block>
      </xsl:when>
      <xsl:otherwise>
        <fo:external-graphic src="{normalize-space($source)}" height="{$realheight}" width="{$realwidth}" content-height="auto" content-width="auto"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <!-- Templates for handling XHTML tags -->
  <xsl:template match="a[@href and (starts-with(@href, 'http') or starts-with(@href, 'mailto') or starts-with(@href, 'ftp'))]">
    <xsl:param name="chapterNumber"/>
    <fo:basic-link external-destination="{@href}">
      <fo:inline xsl:use-attribute-sets="href.external">
        <xsl:apply-templates>
          <xsl:with-param name="chapterNumber">
            <xsl:value-of select="$chapterNumber"/>
          </xsl:with-param>
        </xsl:apply-templates>
      </fo:inline>
    </fo:basic-link>
  </xsl:template>
  <xsl:template match="a[@href and starts-with(@href, '#')]">
    <xsl:param name="chapterNumber"/>
    <fo:basic-link internal-destination="{$chapterNumber}{@href}{generate-id()}">
      <fo:inline xsl:use-attribute-sets="href.internal">
        <xsl:apply-templates>
          <xsl:with-param name="chapterNumber">
            <xsl:value-of select="$chapterNumber"/>
          </xsl:with-param>
        </xsl:apply-templates>
      </fo:inline>
    </fo:basic-link>
  </xsl:template>
  <xsl:template match="a[@href and not(starts-with(@href, 'http')) and not(starts-with(@href, 'mailto')) and not(starts-with(@href, 'ftp')) and not(starts-with(@href, '#'))]">
    <xsl:param name="chapterNumber"/>
    <fo:basic-link internal-destination="{@href}{generate-id()}">
      <fo:inline xsl:use-attribute-sets="href.internal">
        <xsl:apply-templates>
          <xsl:with-param name="chapterNumber">
            <xsl:value-of select="$chapterNumber"/>
          </xsl:with-param>
        </xsl:apply-templates>
      </fo:inline>
    </fo:basic-link>
  </xsl:template>
  <xsl:template match="a[@name]">
    <xsl:param name="chapterNumber"/>
    <fo:block id="{$chapterNumber}#{@name}{generate-id()}">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="br">
    <xsl:param name="chapterNumber"/>
    <fo:block/>
  </xsl:template>
  <xsl:template match="em | i">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-style="italic">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="b | strong[ancestor::table]">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-weight="bold">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="strong[ancestor::p|ancestor::li|ancestor::dl|ancestor::dt|ancestor::dd]">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-weight="bold" xsl:use-attribute-sets="body.strong">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="strong">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-weight="bold">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="sub">
    <xsl:param name="chapterNumber"/>
    <fo:inline baseline-shift="sub">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="sup">
    <xsl:param name="chapterNumber"/>
    <fo:inline baseline-shift="sup">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="tt|code">
    <xsl:param name="chapterNumber"/>
    <fo:inline xsl:use-attribute-sets="body.pre">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="var">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-style="italic">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="big">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-size="larger">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="small">
    <xsl:param name="chapterNumber"/>
    <fo:inline font-size="smaller">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:inline>
  </xsl:template>
  <xsl:template match="ul/ul | ul/ol | ol/ul | ol/ol">
    <xsl:param name="chapterNumber"/>
    <fo:list-item xsl:use-attribute-sets="list.item">
      <fo:list-item-label>
        <fo:block/>
      </fo:list-item-label>
      <fo:list-item-body start-indent="body-start()">
        <fo:block>
          <xsl:apply-templates>
            <xsl:with-param name="chapterNumber">
              <xsl:value-of select="$chapterNumber"/>
            </xsl:with-param>
          </xsl:apply-templates>
        </fo:block>
      </fo:list-item-body>
    </fo:list-item>
  </xsl:template>
  <xsl:template match="ul | ol">
    <xsl:param name="chapterNumber"/>
    <fo:list-block xsl:use-attribute-sets="list">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:list-block>
  </xsl:template>
  <xsl:template match="ul/li">
    <xsl:param name="chapterNumber"/>
    <fo:list-item xsl:use-attribute-sets="list.item">
      <fo:list-item-label>
        <fo:block>
          <xsl:if test="not(@style='list-style: none')">
            <xsl:text>&#8226;</xsl:text>
          </xsl:if>
        </fo:block>
      </fo:list-item-label>
      <fo:list-item-body start-indent="body-start()">
        <fo:block>
          <xsl:apply-templates>
            <xsl:with-param name="chapterNumber">
              <xsl:value-of select="$chapterNumber"/>
            </xsl:with-param>
          </xsl:apply-templates>
        </fo:block>
      </fo:list-item-body>
    </fo:list-item>
  </xsl:template>
  <xsl:template match="ol/li">
    <xsl:param name="chapterNumber"/>
    <fo:list-item xsl:use-attribute-sets="list.item">
      <fo:list-item-label>
        <fo:block>
          <xsl:number format="1."/>
        </fo:block>
      </fo:list-item-label>
      <fo:list-item-body start-indent="body-start()">
        <fo:block>
          <xsl:apply-templates>
            <xsl:with-param name="chapterNumber">
              <xsl:value-of select="$chapterNumber"/>
            </xsl:with-param>
          </xsl:apply-templates>
        </fo:block>
      </fo:list-item-body>
    </fo:list-item>
  </xsl:template>
  <xsl:template match="dl">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="dl">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="dt">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="dt">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="dd">
    <xsl:param name="chapterNumber"/>
    <fo:block xsl:use-attribute-sets="dd">
      <xsl:apply-templates>
        <xsl:with-param name="chapterNumber">
          <xsl:value-of select="$chapterNumber"/>
        </xsl:with-param>
      </xsl:apply-templates>
    </fo:block>
  </xsl:template>
  <xsl:template match="style"/>
</xsl:stylesheet>
