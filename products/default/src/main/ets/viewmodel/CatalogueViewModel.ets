import { RouteConstants } from '../constants/RouteConstants';
import { CatalogueItemData } from './CatalogueItemData';

/**
 * Catalogue list page view model.
 */
class CatalogueViewModel {
  /**
   * Get Catalogue data.
   *
   * @return {Array<CatalogueItemData>} CatalogueData.
   */
  getCatalogueData(): CatalogueItemData[] {
    let catalogueData: CatalogueItemData[] =
      [new CatalogueItemData($r('app.string.responsive_layout'), RouteConstants.RESPONSIVE_ROUTE),
        new CatalogueItemData($r('app.string.adaptive_layout'), RouteConstants.ADAPTIVE_ROUTE),
        new CatalogueItemData($r('app.string.system_cap'), RouteConstants.SYSTEM_CAPABILITIES_ROUTE)];
    return catalogueData;
  }
}

let catalogueViewModel = new CatalogueViewModel();

export default catalogueViewModel as CatalogueViewModel;