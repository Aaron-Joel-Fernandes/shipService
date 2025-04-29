package com.shipment.util;

import com.shipment.model.Shipment;
import com.shipment.repository.InMemoryShipmentRepository;

import java.util.List;
import java.util.Optional;

public class Utilities {
    private static final InMemoryShipmentRepository repository = new InMemoryShipmentRepository();

    public static Shipment saveShipment(Shipment shipment) {
        return repository.save(shipment);
    }

    public static boolean deleteShipmentById(String resourceId) {
        return repository.deleteById(resourceId);
    }

    public static Optional<Shipment> getShipmentById(String resourceId) {
        return repository.findById(resourceId);
    }

    public static List<Shipment> getAllShipments() {
        return repository.findAll();
    }

    public static void clearDB() {
        repository.clear();
    }
}
