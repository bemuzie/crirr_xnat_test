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
    <!-- These attribute-sets are treated as 'styles,'
       and are referenced in the all templates -->
    <!-- Style 'primitives' from which all others are descended -->
    <xsl:attribute-set name="base.body.style">
        <xsl:attribute name="font-family">Garamond,serif</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="base.heading.style">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="color">#000000</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="base.pre.style">
        <xsl:attribute name="font-family">monospace</xsl:attribute>
    </xsl:attribute-set>
    <!-- Standard body and heading styles -->
    <xsl:attribute-set name="body.text" use-attribute-sets="base.body.style">
        <xsl:attribute name="font-size">11pt</xsl:attribute>
        <xsl:attribute name="line-height">12pt</xsl:attribute>
        <xsl:attribute name="white-space-collapse">true</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.pre" use-attribute-sets="base.pre.style">
        <xsl:attribute name="font-size">10pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.source" use-attribute-sets="base.pre.style">
        <xsl:attribute name="font-size">8pt</xsl:attribute>
        <xsl:attribute name="wrap-option">wrap</xsl:attribute>
        <xsl:attribute name="white-space-collapse">false</xsl:attribute>
        <xsl:attribute name="color">black</xsl:attribute>
        <xsl:attribute name="border-style">dotted</xsl:attribute>
        <xsl:attribute name="border-width">0.5pt</xsl:attribute>
        <xsl:attribute name="border-color"><xsl:value-of select="$colorMediumGray"/></xsl:attribute>
        <xsl:attribute name="padding-before">1.0em</xsl:attribute>
        <xsl:attribute name="padding-after">1.25em</xsl:attribute>
        <xsl:attribute name="padding-start">0.75em</xsl:attribute>
        <xsl:attribute name="padding-end">0.75em</xsl:attribute>
        <xsl:attribute name="start-indent">inherited-property-value(start-indent) + 2.5em</xsl:attribute>
        <xsl:attribute name="end-indent">inherited-property-value(end-indent) + 3em</xsl:attribute>
        <xsl:attribute name="space-before">0.75em</xsl:attribute>
        <xsl:attribute name="space-after">1em</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.strong">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="font-size">9.0pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.title" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">16pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.h1" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">12pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
        <xsl:attribute name="space-before">18pt</xsl:attribute>
        <xsl:attribute name="space-after">6pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.h2" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
        <xsl:attribute name="space-before">18pt</xsl:attribute>
        <xsl:attribute name="space-after">5pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.h3" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="space-before">15pt</xsl:attribute>
        <xsl:attribute name="space-after">3pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.h4" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="space-before">9pt</xsl:attribute>
        <xsl:attribute name="space-after">3pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="body.h5" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="font-style">italic</xsl:attribute>
        <xsl:attribute name="space-after">3pt</xsl:attribute>
    </xsl:attribute-set>
    <!-- Chapter heading styles -->
    <xsl:attribute-set name="chapter.title" use-attribute-sets="base.heading.style body.title">
        <xsl:attribute name="line-height">10pt</xsl:attribute>
        <xsl:attribute name="space-after">6pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="chapter.rule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">dots</xsl:attribute>
        <xsl:attribute name="rule-thickness">1pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorDarkGray"/></xsl:attribute>
    </xsl:attribute-set>
    <!-- Outdented numbers -->
    <xsl:attribute-set name="outdented.number.style" use-attribute-sets="base.heading.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorDarkGray"/></xsl:attribute>
        <xsl:attribute name="line-height">10pt</xsl:attribute>
        <xsl:attribute name="text-align">right</xsl:attribute>
    </xsl:attribute-set>
    <!-- Page header/footer styles -->
    <xsl:attribute-set name="footer.style">
        <xsl:attribute name="letter-spacing">2pt</xsl:attribute>
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="font-size">6pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorDarkGray"/></xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="header.style">
        <xsl:attribute name="letter-spacing">2pt</xsl:attribute>
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="font-size">6pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorDarkGray"/></xsl:attribute>
        <xsl:attribute name="text-align">left</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="page.number">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="text-align">right</xsl:attribute>
        <xsl:attribute name="color">black</xsl:attribute>
    </xsl:attribute-set>
    <!-- Style for hyperlinks -->
    <xsl:attribute-set name="href.internal">
        <xsl:attribute name="color">blue</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="href.external">
        <xsl:attribute name="color">green</xsl:attribute>
    </xsl:attribute-set>
    <!-- 'Normal' line-spacing styles for paragraph and pre elements -->
    <xsl:attribute-set name="normal.paragraph" use-attribute-sets="base.body.style">
        <xsl:attribute name="space-before">3pt</xsl:attribute>
        <xsl:attribute name="space-after">6pt</xsl:attribute>
    </xsl:attribute-set>
    <!-- Styles for lists, list items, definition lists, etc.  -->
    <xsl:attribute-set name="list">
        <xsl:attribute name="start-indent">inherited-property-value(start-indent)</xsl:attribute>
        <xsl:attribute name="provisional-distance-between-starts">1em</xsl:attribute>
        <xsl:attribute name="provisional-label-separation">1em</xsl:attribute>
    </xsl:attribute-set>
    <!-- 1pt before, 3pts after -->
    <xsl:attribute-set name="list.item">
        <xsl:attribute name="start-indent">inherited-property-value(start-indent) + .5em</xsl:attribute>
        <xsl:attribute name="space-before">0.15em</xsl:attribute>
        <xsl:attribute name="space-after">0.25em</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="dl" use-attribute-sets="body.text">
        <xsl:attribute name="start-indent">1em</xsl:attribute>
        <xsl:attribute name="end-indent">1em</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="dt" use-attribute-sets="base.body.style">
        <xsl:attribute name="start-indent">1em</xsl:attribute>
        <xsl:attribute name="end-indent">1em</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="dd" use-attribute-sets="base.body.style">
        <xsl:attribute name="start-indent">1em</xsl:attribute>
        <xsl:attribute name="end-indent">1em</xsl:attribute>
        <xsl:attribute name="space-before">0.6em</xsl:attribute>
        <xsl:attribute name="space-after">0.6em</xsl:attribute>
    </xsl:attribute-set>
    <!-- Error style -->
    <xsl:attribute-set name="error.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">8pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
        <xsl:attribute name="color">red</xsl:attribute>
        <xsl:attribute name="border-style">solid</xsl:attribute>
        <xsl:attribute name="border-width">0.5pt</xsl:attribute>
        <xsl:attribute name="border-color">red</xsl:attribute>
        <xsl:attribute name="padding">0.75em</xsl:attribute>
        <xsl:attribute name="start-indent">inherited-property-value(start-indent) + 2.5em</xsl:attribute>
        <xsl:attribute name="end-indent">inherited-property-value(end-indent) + 3em</xsl:attribute>
    </xsl:attribute-set>
    <!-- cover styles -->
    <xsl:attribute-set name="cover.title">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="color">#000000</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
        <xsl:attribute name="font-size">16pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="cover.subtitle">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="color">#000000</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
        <xsl:attribute name="font-size">12pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="cover.border.left" use-attribute-sets="base.pre.style">
        <xsl:attribute name="padding-start">0.2in</xsl:attribute>
        <xsl:attribute name="border-left-style">dotted</xsl:attribute>
        <xsl:attribute name="border-left-width">0.1pt</xsl:attribute>
        <xsl:attribute name="border-left-color">#000000</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="cover.border.left.bottom" use-attribute-sets="cover.border.left">
        <xsl:attribute name="padding-after">0.2in</xsl:attribute>        
        <xsl:attribute name="border-bottom-style">dotted</xsl:attribute>
        <xsl:attribute name="border-bottom-width">0.1pt</xsl:attribute>
        <xsl:attribute name="border-bottom-color">#000000</xsl:attribute>
    </xsl:attribute-set>
    <!-- Tables styles -->
    <xsl:attribute-set name="table.heading.rule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">rule</xsl:attribute>
        <xsl:attribute name="rule-thickness">0.5pt</xsl:attribute>
        <xsl:attribute name="color">black</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="base.cell">
        <xsl:attribute name="padding-start">2.5pt</xsl:attribute>
        <xsl:attribute name="padding-end">5pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="base.block">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="line-height">1.2em</xsl:attribute>
    </xsl:attribute-set>
    <!-- Bumped padding down by 6 pts before & after -->
    <xsl:attribute-set name="table.padding">
        <xsl:attribute name="padding-before">9pt</xsl:attribute>
        <xsl:attribute name="padding-after">12pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.title.row">
        <xsl:attribute name="keep-together">always</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.title.cell" use-attribute-sets="base.cell">
        <xsl:attribute name="border-after-style">solid</xsl:attribute>
        <xsl:attribute name="border-after-width">0.5pt</xsl:attribute>
        <xsl:attribute name="border-after-color">black</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.title.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.footer.cell" use-attribute-sets="base.cell">
        <xsl:attribute name="padding-before">5pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.footer.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">7pt</xsl:attribute>
        <xsl:attribute name="font-style">italic</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.heading.cell" use-attribute-sets="base.cell">
        <xsl:attribute name="padding-before">7pt</xsl:attribute>
        <xsl:attribute name="display-align">after</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.heading.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">8pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.heading.rule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">rule</xsl:attribute>
        <xsl:attribute name="rule-thickness">0.5pt</xsl:attribute>
        <xsl:attribute name="color">black</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.number.cell" use-attribute-sets="base.cell">
        <xsl:attribute name="padding-before">6pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.number.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">7pt</xsl:attribute>
        <xsl:attribute name="font-style">italic</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.subheading.row">
        <xsl:attribute name="keep-together">always</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.subheading.cell" use-attribute-sets="base.cell">
        <xsl:attribute name="padding-after">1pt</xsl:attribute>
        <xsl:attribute name="background-color"><xsl:value-of select="$colorLightGray"/></xsl:attribute>
        <xsl:attribute name="border-before-style">solid</xsl:attribute>
        <xsl:attribute name="border-before-width">2.5pt</xsl:attribute>
        <xsl:attribute name="border-before-color"><xsl:value-of select="$colorLightGray"/></xsl:attribute>
        <xsl:attribute name="display-align">after</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.subheading.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">7pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
        <xsl:attribute name="vertical-align">bottom</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.row">
        <xsl:attribute name="keep-together">always</xsl:attribute>
        <xsl:attribute name="keep-with-next">always</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.norule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">rule</xsl:attribute>
        <xsl:attribute name="rule-thickness">1pt</xsl:attribute>
        <xsl:attribute name="color">white</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.rule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">dots</xsl:attribute>
        <xsl:attribute name="rule-thickness">0.5pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorMediumGray"/></xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.lastrule">
        <xsl:attribute name="leader-length.optimum">100%</xsl:attribute>
        <xsl:attribute name="leader-pattern">rule</xsl:attribute>
        <xsl:attribute name="rule-thickness">0.5pt</xsl:attribute>
        <xsl:attribute name="color">black</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.cell" use-attribute-sets="base.cell">
        <!-- Bumped both down by 3 pts -->
        <xsl:attribute name="padding-before">4pt</xsl:attribute>
        <xsl:attribute name="padding-after">1.5pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.body.block" use-attribute-sets="base.block">
        <xsl:attribute name="font-size">7pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="table.pre" use-attribute-sets="base.pre.style">
        <xsl:attribute name="font-size">7pt</xsl:attribute>
    </xsl:attribute-set>
    <!-- Table of content styles -->
    <xsl:attribute-set name="toc.cell">
        <xsl:attribute name="display-align">after</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.base.style">
        <xsl:attribute name="font-family">Helvetica,sans-serif</xsl:attribute>
        <xsl:attribute name="line-height">16pt</xsl:attribute>
        <xsl:attribute name="text-align-last">start</xsl:attribute>
        <xsl:attribute name="wrap-option">no-wrap</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.leader.style">
        <xsl:attribute name="leader-pattern">dots</xsl:attribute>
        <xsl:attribute name="leader-pattern-width">5pt</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorDarkGray"/></xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.number.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="text-align">end</xsl:attribute>
        <xsl:attribute name="color"><xsl:value-of select="$colorMediumGray"/></xsl:attribute>
        <xsl:attribute name="line-height">16pt</xsl:attribute>
        <xsl:attribute name="end-indent">6pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.h1.style" use-attribute-sets="toc.base.style">
        <xsl:attribute name="font-size">12pt</xsl:attribute>
        <xsl:attribute name="font-weight">bold</xsl:attribute>
        <xsl:attribute name="space-before">18pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.h2.style" use-attribute-sets="toc.base.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="space-before">15pt</xsl:attribute>
        <xsl:attribute name="space-before">3pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.h3.style" use-attribute-sets="toc.base.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="space-before">4pt</xsl:attribute>
    </xsl:attribute-set>
    <xsl:attribute-set name="toc.h4.style" use-attribute-sets="toc.base.style">
        <xsl:attribute name="font-size">9.5pt</xsl:attribute>
        <xsl:attribute name="space-before">4pt</xsl:attribute>
    </xsl:attribute-set>
</xsl:stylesheet>
