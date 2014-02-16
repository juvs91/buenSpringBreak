package entities;

import entities.CommDeviceTags;
import entities.MeasurementUnits;
import entities.Outputs;
import entities.SensorCatalog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(SensorTags.class)
public class SensorTags_ { 

    public static volatile SingularAttribute<SensorTags, CommDeviceTags> commDeviceTag;
    public static volatile SingularAttribute<SensorTags, Float> minValue;
    public static volatile CollectionAttribute<SensorTags, Outputs> outputsCollection;
    public static volatile SingularAttribute<SensorTags, Boolean> active;
    public static volatile SingularAttribute<SensorTags, Date> insertDate;
    public static volatile SingularAttribute<SensorTags, MeasurementUnits> idMeasurementUnit;
    public static volatile SingularAttribute<SensorTags, String> sensorTag;
    public static volatile SingularAttribute<SensorTags, SensorCatalog> idSensorCatalog;
    public static volatile SingularAttribute<SensorTags, Float> maxValue;
    public static volatile SingularAttribute<SensorTags, Date> lastUpdateDate;

}