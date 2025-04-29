package org.edureka.shipping;

public class ShipmentServiceImpl implements IShipment {
	@Override
	public Shipment addShipment(Shipment shipment) {
		return Utilities.saveShipment(shipment);
	}

	@Override
	public boolean deleteShipment(String resourceId) {
		return Utilities.deleteShipmentById(resourceId);
	}

	@Override
	public Optional<Shipment> getShipment(String resourceId) {
		return Utilities.getShipmentById(resourceId);
	}

}
