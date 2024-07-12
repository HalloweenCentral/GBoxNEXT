import { router } from '@kit.ArkUI';
import { CommonConstants } from '../constants/CommonConstants';
import { CatalogueItemData } from '../viewmodel/CatalogueItemData';

@Component
export struct CatalogueListComponent {
  catalogue: CatalogueItemData[] = [];

  build() {
    Column() {
      GridRow({
        columns: {
          xs: CommonConstants.COLUMN_XS,
          sm: CommonConstants.COLUMN_SM,
          md: CommonConstants.COLUMN_MD,
          lg: CommonConstants.COLUMN_LG
        }
      }) {
        GridCol({
          span: {
            xs: CommonConstants.SPAN_XS,
            sm: CommonConstants.SPAN_SM,
            md: CommonConstants.SPAN_MD,
            lg: CommonConstants.SPAN_LG
          },
          offset: {
            xs: CommonConstants.OFFSET_XS,
            sm: CommonConstants.OFFSET_SM,
            md: CommonConstants.OFFSET_MD,
            lg: CommonConstants.OFFSET_LG
          }
        }) {
          List() {
            ForEach(this.catalogue, (item: CatalogueItemData) => {
              ListItem() {
                Text(item.title)
                  .fontSize($r('app.float.catalogue_text_font_size'))
                  .fontColor($r('sys.color.ohos_id_color_text_primary_contrary'))
                  .fontWeight(CommonConstants.LIST_FONT_WEIGHT)
              }
              .backgroundColor($r('sys.color.ohos_id_color_emphasize'))
              .width(CommonConstants.LIST_ITEM_WIDTH)
              .height($r('app.float.catalogue_list_item_height'))
              .margin({ bottom: $r('app.float.catalogue_list_item_margin_bottom') })
              .borderRadius($r('app.float.catalogue_list_item_border_radius'))
              .onClick(() => {
                router.pushUrl({
                  url: item.uri,
                  params: {
                    data: item.params
                  }
                })
              })
            }, (item: CatalogueItemData, index?: number) => index + JSON.stringify(item))
          }
          .width(CommonConstants.LIST_WIDTH)
          .height($r('app.float.catalogue_list_height'))
          .scrollBar(BarState.Off)
        }
      }
    }
    .justifyContent(FlexAlign.Center)
    .alignItems(HorizontalAlign.Center)
    .height(CommonConstants.COLUMN_HEIGHT)
    .margin({
      left: $r('app.float.catalogue_list_margin_left'),
      right: $r('app.float.catalogue_list_margin_right')
    })
  }
}