package graph.object;

import graph.object.DataPointTemp;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(SensorTemp.class)
public class SensorTemp_ { 

    public static volatile SingularAttribute<SensorTemp, String> unit;
    public static volatile SingularAttribute<SensorTemp, Long> sensorTemp_ID;
    public static volatile ListAttribute<SensorTemp, DataPointTemp> points;
    public static volatile SingularAttribute<SensorTemp, String> sensorName;

}