
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.MapView;
import ohos.agp.components.MapView.OnMapReadyCallback;
import ohos.agp.components.MapView.MapViewListener;
import ohos.agp.maps.model.LatLng;
import ohos.agp.maps.model.MarkerOptions;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        MapView mapView = (MapView) findComponentById(ResourceTable.Id_mapView);
        mapView.onCreate(null);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(HuaweiMap huaweiMap) {
                LatLng location = new LatLng(-34, 151);
                huaweiMap.addMarker(new MarkerOptions().position(location).title("Marker"));
            }
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onInactive() {
        super.onInactive();
    }

    @Override
    public void onBackground() {
        super.onBackground();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
