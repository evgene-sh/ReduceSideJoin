import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class AirReducer extends Reducer<AirWC, Text, Text, Text> {

    @Override
    protected void reduce(AirWC key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> set = values.iterator();

        for()
    }
}
