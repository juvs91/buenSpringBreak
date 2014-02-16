package entities;

import entities.Outputs;
import entities.SensorTags;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
=======
@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T18:47:18")
>>>>>>> 467fbd065cca84085693ca57f037cda2d6f6cba5
@StaticMetamodel(MeasurementUnits.class)
public class MeasurementUnits_ { 

    public static volatile CollectionAttribute<MeasurementUnits, SensorTags> sensorTagsCollection;
    public static volatile SingularAttribute<MeasurementUnits, String> unitName;
    public static volatile CollectionAttribute<MeasurementUnits, Outputs> outputsCollection;
    public static volatile SingularAttribute<MeasurementUnits, Integer> idMeasurementUnit;
    public static volatile SingularAttribute<MeasurementUnits, Boolean> active;
    public static volatile SingularAttribute<MeasurementUnits, Date> lastUpdateDate;

}