export class CatalogueItemData {
  title: Resource = $r('app.string.responsive_layout');
  uri: string = '';
  params?: string;

  constructor(title: Resource, uri: string, params?: string) {
    this.title = title;
    this.uri = uri;
    this.params = params;
  }
}