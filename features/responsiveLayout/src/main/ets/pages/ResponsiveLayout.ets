import { BreakpointSystem, BreakPointType } from '@ohos/common';
import { GridComponent } from '../view/GridComponent';
import { CommonConstants } from '../constants/CommonConstants';
import { TabBarItem } from '../viewmodel/TabBarItem';
import TabsViewModel from '../viewmodel/TabsViewModel';

/**
 * ResponsiveLayout page is the entry of project responsiveLayout which combining tab components with grid components.
 */
@Component
export struct ResponsiveLayout {
  build() {
    Column() {
      TabIndex()
    }
  }
}

@Component
export struct TabIndex {
  @State currentIndex: number = 0;
  @State tabs: Array<TabBarItem> = TabsViewModel.getTabData();
  @StorageLink('mainBreakpoint') currentBreakpoint: string = CommonConstants.BREAKPOINTS_INITIALIZE_NAME;
  private breakpointSystem: BreakpointSystem = new BreakpointSystem(CommonConstants.BREAKPOINT_SYSTEM_NAME);

  aboutToAppear() {
    this.breakpointSystem.register();
  }

  aboutToDisappear() {
    this.breakpointSystem.unregister();
  }

  @Builder TabBarBuilder(tabBar: TabBarItem, index?: number) {
    Flex({
      direction: new BreakPointType({
        sm: FlexDirection.Column,
        md: FlexDirection.Row,
        lg: FlexDirection.Column,
        xl: FlexDirection.Column
      })
      .getValue(this.currentBreakpoint), justifyContent: FlexAlign.Center, alignItems: ItemAlign.Center
    }) {
      Image(this.currentIndex === index ? tabBar.selectIcon : tabBar.icon)
        .size({ width: $r('app.float.tab_img_width'), height: $r('app.float.tab_img_height') })
      Text(tabBar.name)
        .fontSize($r('app.float.tab_text_font_size'))
        .fontColor(this.currentIndex === index ?
          $r('sys.color.ohos_id_color_text_primary_activated') : $r('sys.color.ohos_id_color_text_secondary'))
        .margin(new BreakPointType<Padding>({
          sm: { top: $r('app.float.tab_text_sm_top'), left: $r('app.float.tab_text_sm_left') },
          md: { top: $r('app.float.tab_text_md_top'), left: $r('app.float.tab_text_md_left') },
          lg: { top: $r('app.float.tab_text_lg_top'), left: $r('app.float.tab_text_lg_left') },
          xl: { top: $r('app.float.tab_text_xl_top'), left: $r('app.float.tab_text_xl_left') }
        })
        .getValue(this.currentBreakpoint))
    }
    .width(CommonConstants.FLEX_TAB_BAR_WIDTH)
    .height(CommonConstants.FLEX_TAB_BAR_HEIGHT)
  }

  build() {
    Column() {
      Tabs({
        barPosition: new BreakPointType({
          sm: BarPosition.End,
          md: BarPosition.End,
          lg: BarPosition.Start,
          xl: BarPosition.Start
        })
        .getValue(this.currentBreakpoint)
      }) {
        ForEach(this.tabs, (item: TabBarItem, index?: number) => {
          TabContent() {
            GridComponent()
          }
          .tabBar(this.TabBarBuilder(item, index))
          .width(CommonConstants.TAB_CONTENT_WIDTH)
          .height(CommonConstants.TAB_CONTENT_HEIGHT)
        })
      }
      .vertical(new BreakPointType({
        sm: CommonConstants.TAB_SM_VERTICAL,
        md: CommonConstants.TAB_MD_VERTICAL,
        lg: CommonConstants.TAB_LG_VERTICAL,
        xl: CommonConstants.TAB_XL_VERTICAL
      })
      .getValue(this.currentBreakpoint))
      .barWidth(new BreakPointType({
        sm: CommonConstants.TAB_SM_BAR_WIDTH,
        md: CommonConstants.TAB_MD_BAR_WIDTH,
        lg: CommonConstants.TAB_LG_BAR_WIDTH,
        xl: CommonConstants.TAB_XL_BAR_WIDTH
      })
      .getValue(this.currentBreakpoint))
      .barHeight(new BreakPointType({
        sm: CommonConstants.TAB_SM_BAR_HEIGHT,
        md: CommonConstants.TAB_MD_BAR_HEIGHT,
        lg: CommonConstants.TAB_LG_BAR_HEIGHT,
        xl: CommonConstants.TAB_XL_BAR_HEIGHT
      })
      .getValue(this.currentBreakpoint))
      .onChange((index: number) => {
        this.currentIndex = index;
      })
    }
    .backgroundColor($r('sys.color.ohos_id_color_sub_background'))
  }
}