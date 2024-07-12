import { CommonConstants } from '../constants/CommonConstants';
import { TabBarItem } from './TabBarItem';

/**
 * Binds data to components and provides interfaces.
 */
export class TabsViewModel {
  /**
   * Get item information for the tab.
   *
   * @return {Array<TabBarItem>} tabItems
   */
  getTabData(): Array<TabBarItem> {
    let tabItems: Array<TabBarItem> = [];
    for (let i = 0; i < CommonConstants.TAB_SIZE; i++) {
      let itemInfo: TabBarItem = new TabBarItem();
      itemInfo.name = $r('app.string.tab_name');
      itemInfo.icon = $r('app.media.ic_tabs_icon');
      itemInfo.selectIcon = $r('app.media.ic_tabs_icon_selected');
      tabItems.push(itemInfo);
    }
    return tabItems;
  }
}

let tabsViewModel = new TabsViewModel();

export default tabsViewModel as TabsViewModel;