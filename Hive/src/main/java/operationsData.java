import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDF;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;

/**
 * @author zz
 * @date 2021/8/10
 **/
public class operationsData  extends GenericUDF {


    @Override
    public ObjectInspector initialize(ObjectInspector[] objectInspectors) throws UDFArgumentException {

        if (objectInspectors.length != 1) {
            throw new UDFArgumentException("参数个数不为1");
        }
        return PrimitiveObjectInspectorFactory.writableIntObjectInspector;
    }

    @Override
    public Object evaluate(DeferredObject[] deferredObjects) throws HiveException {
        return null;
    }

    //执行计划
    @Override
    public String getDisplayString(String[] strings) {
        return "";
    }
}
