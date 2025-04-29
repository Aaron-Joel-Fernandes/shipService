package org.edureka.shipping;

public class ShipmentServiceImpl implements IShipment {
	private final Map<String, Shipment> shipmentStore = new HashMap<>();

	@Override
	public Shipment addShipment(Shipment shipment) {
		shipmentStore.put(shipment.getResourceId(), shipment);
		return shipment;
	}

	@Override
	public boolean deleteShipment(String resourceId) {
		return shipmentStore.remove(resourceId) != null;
	}

	@Override
	public Optional<Shipment> getShipment(String resourceId) {
		return Optional.ofNullable(shipmentStore.get(resourceId));
	}

}
