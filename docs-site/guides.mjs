// The published, user-facing pages (allowlist). Shared by the sync script and the
// VitePress config so the set and its order are defined exactly once.
//   file  — source markdown in ../docs (the single source of truth)
//   slug  — route name under /guides/
//   title — sidebar / nav label
//
// Pages NOT listed here stay unpublished and are browsed on GitHub instead;
// sync-guides.mjs rewrites cross-links to them into blob URLs.
export const GUIDES = [
  { file: 'overview.md', slug: 'overview', title: 'Overview' },
  { file: 'model-catalog.md', slug: 'model-catalog', title: 'Model catalog & origins' },
  { file: 'consuming.md', slug: 'consuming', title: 'Consuming the models' },
  { file: 'adding-a-model.md', slug: 'adding-a-model', title: 'Adding a new model' },
];
