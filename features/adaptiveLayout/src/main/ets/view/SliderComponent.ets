import { CommonConstants } from '../constants/CommonConstants';

@Component
export struct SliderComponent {
  @LocalStorageLink('containerWidth') containerWidth: number = 55;

  build() {
    Slider({
      value: this.containerWidth,
      min: CommonConstants.SLIDER_MIN,
      max: CommonConstants.SLIDER_MAX
    })
      .width($r('app.float.slider_width'))
      .onChange((value: number) => {
        this.containerWidth = value;
      })
  }
}

