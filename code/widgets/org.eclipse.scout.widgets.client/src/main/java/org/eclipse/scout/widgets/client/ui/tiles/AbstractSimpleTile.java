package org.eclipse.scout.widgets.client.ui.tiles;

import org.eclipse.scout.rt.client.ui.tile.AbstractTile;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.platform.annotations.ConfigProperty;

public abstract class AbstractSimpleTile extends AbstractTile implements ISimpleTile {

  @Override
  protected void initConfig() {
    super.initConfig();

    setLabel(getConfiguredLabel());
  }

  @ConfigProperty(ConfigProperty.TEXT)
  @Order(10)
  protected String getConfiguredLabel() {
    return null;
  }

  @Override
  public String getLabel() {
    return propertySupport.getPropertyString(PROP_LABEL);
  }

  @Override
  public void setLabel(String label) {
    propertySupport.setProperty(PROP_LABEL, label);
  }
}
