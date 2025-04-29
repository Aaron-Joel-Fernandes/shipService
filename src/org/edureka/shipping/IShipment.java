package org.edureka.shipping;

public interface IShipment {

	Shipment addShipment(Shipment shipment);
	boolean deleteShipment(String resourceId);
	Optional<Shipment> getShipment(String resourceId);
	
}
