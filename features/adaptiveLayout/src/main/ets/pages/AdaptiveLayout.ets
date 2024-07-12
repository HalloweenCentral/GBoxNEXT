import { SliderComponent } from '../view/SliderComponent';
import { CommonConstants } from '../constants/CommonConstants';

@Component
struct AdaptiveLayoutItem {
  @LocalStorageLink('containerWidth') containerWidth: number = 55;

  build() {
    Column() {
      Column() {
        Row() {
          Row()
            .width($r('app.float.flexible_left_item_width'))
            .height($r('app.float.flexible_left_item_height'))
            .backgroundColor($r('sys.color.ohos_id_color_component_normal'))
            .borderRadius($r('app.float.flexible_left_item_border_radius'))
          Blank()
          Row()
            .width($r('app.float.flexible_right_item_width'))
            .height($r('app.float.flexible_right_item_height'))
            .backgroundColor($r('sys.color.ohos_id_color_component_normal'))
            .borderRadius($r('app.float.flexible_right_item_border_radius'))
        }
        .height($r('app.float.flexible_item_height'))
        .borderRadius($r('app.float.flexible_item_border_radius'))
        .padding({
          left: $r('app.float.flexible_item_padding_left'),
          right: $r('app.float.flexible_item_padding_right')
        })
        .backgroundColor($r('sys.color.ohos_id_color_background'))
        .width('' + this.containerWidth + CommonConstants.PERCENT_SIGN)
      }
      .width(CommonConstants.COLUMN_WIDTH)
      .flexShrink(CommonConstants.COLUMN_FLEX_SHRINK)
      .height(CommonConstants.COLUMN_HEIGHT)
      .justifyContent(FlexAlign.Center)

      Column() {
        SliderComponent()
      }
      .margin({ bottom: CommonConstants.SLIDER_MARGIN })
    }
    .height(CommonConstants.HEIGHT)
    .width(CommonConstants.WIDTH)
  }
}

@Component
export struct AdaptiveLayout {
  build() {
    Column() {
      AdaptiveLayoutItem()
    }
    .height(CommonConstants.HEIGHT)
    .justifyContent(FlexAlign.Center)
  }
}