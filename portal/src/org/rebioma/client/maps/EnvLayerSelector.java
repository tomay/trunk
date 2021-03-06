/*
 * Copyright 2008 University of California at Berkeley
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.rebioma.client.maps;

import java.util.ArrayList;
import java.util.List;

import org.rebioma.client.DataSwitch;
import org.rebioma.client.bean.AscData;
import org.rebioma.client.maps.AscTileLayer.LayerInfo;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * A tile layer selector that overlays {@link EnvLayer} on a Google map.
 */
public class EnvLayerSelector extends TileLayerSelector {

  public EnvLayerSelector(TileLayerCallback callback) {
    super(callback);
  }

  @Override
  protected void loadLayers(final AsyncCallback<List<LayerInfo>> asyncCallback) {
    DataSwitch.get().getAscData(new AsyncCallback<List<AscData>>() {
      public void onFailure(Throwable caught) {
        asyncCallback.onFailure(caught);
      }

      public void onSuccess(List<AscData> result) {
        List<LayerInfo> layers = new ArrayList<LayerInfo>();
        for (AscData data : result) {
          layers.add(EnvLayer.init(data));
        }
        asyncCallback.onSuccess(layers);
      }
    });
  }

}
