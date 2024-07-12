import { ResponsiveLayout } from '@ohos/responsivelayout';

/**
 * ResponsiveIndex is the entry of the responsive layout pages.
 */
@Entry
@Component
struct ResponsiveIndex {
  build() {
    Column() {
      ResponsiveLayout()
    }
  }
}