package graph.object;

import graph.object.DataPointGas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-02-15T20:52:08")
@StaticMetamodel(SensorGas.class)
public class SensorGas_ { 

    public static volatile SingularAttribute<SensorGas, String> unit;
    public static volatile ListAttribute<SensorGas, DataPointGas> points;
    public static volatile SingularAttribute<SensorGas, Long> sensorGas_ID;
    public static volatile SingularAttribute<SensorGas, String> sensorName;

}