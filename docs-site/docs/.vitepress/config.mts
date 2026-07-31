import { defineConfig } from 'vitepress'
import { GUIDES } from '../../guides.mjs'

// Per-project docs are served under a versioned sub-path, matching the org
// convention (https://eclipse-fennec.github.io/<repo>/<version>/). The snapshot
// branch publishes to /common.models/snapshot/; tagged releases / `latest` get
// added once the first release lands.
const version = process.env.DOCS_BRANCH || 'snapshot'
const base = `/common.models/${version}/`

// Canonical published origin. Links that point OUTSIDE the current docs base
// (other doc versions) must be full URLs — VitePress auto-prepends `base` to any
// root-absolute (`/…`) link, which would otherwise double the path.
const SITE = 'https://eclipse-fennec.github.io/common.models'

// Version selector. Only `snapshot` is deployed today; keep as data so adding
// `latest` and tagged versions later is a one-liner.
const versions = [{ text: 'snapshot', link: `${SITE}/snapshot/` }]

const guideItems = GUIDES.map((g) => ({ text: g.title, link: `/guides/${g.slug}` }))

export default defineConfig({
  title: 'Fennec Common Models',
  description:
    'Ready-to-use EMF models for common standards — OGC, W3C, OMG, HL7 FHIR, XOeV and more — packaged as OSGi bundles.',
  lang: 'en-US',
  base,
  cleanUrls: true,
  lastUpdated: true,
  ignoreDeadLinks: true,

  markdown: {
    // Shiki has no dedicated 'gradle' grammar; Gradle build files are Groovy.
    languageAlias: { gradle: 'groovy', bnd: 'properties' },
  },

  head: [
    ['link', { rel: 'icon', type: 'image/png', href: `${base}fennec-logo.png` }],
    ['meta', { name: 'theme-color', content: '#c0631c' }],
    ['meta', { property: 'og:type', content: 'website' }],
    ['meta', { property: 'og:title', content: 'Fennec Common Models' }],
    [
      'meta',
      {
        property: 'og:description',
        content:
          'Ready-to-use EMF models for common standards, packaged as OSGi bundles.',
      },
    ],
  ],

  themeConfig: {
    logo: '/fennec-logo.png',
    siteTitle: 'Fennec Common Models',

    nav: [
      { text: 'Home', link: '/' },
      { text: 'User Manual', items: guideItems },
      { text: `version: ${version}`, items: versions },
    ],

    sidebar: {
      '/guides/': [{ text: 'User Manual', items: guideItems }],
    },

    socialLinks: [
      { icon: 'github', link: 'https://github.com/eclipse-fennec/common.models' },
    ],

    search: { provider: 'local' },

    editLink: {
      pattern: 'https://github.com/eclipse-fennec/common.models/edit/main/docs/:path',
      text: 'Edit this page on GitHub',
    },

    footer: {
      message:
        'Released under the EPL-2.0 License. Eclipse Fennec is part of the Eclipse Foundation.',
      copyright: 'Copyright © Eclipse Foundation and contributors',
    },
  },
})
