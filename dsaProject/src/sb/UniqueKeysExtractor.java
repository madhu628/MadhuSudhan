package sb;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UniqueKeysExtractor {

	public static Set<String> getUniqueKeys(JsonNode jsonNode) {
		Set<String> uniqueKeys = new HashSet<>();
		extractKeys(jsonNode, uniqueKeys);
		return uniqueKeys;
	}

	private static void extractKeys(JsonNode jsonNode, Set<String> keys) {
		if (jsonNode.isObject()) {
			Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> field = fields.next();
				keys.add(field.getKey());
				extractKeys(field.getValue(), keys);
			}
		} else if (jsonNode.isArray()) {
			for (JsonNode arrayElement : jsonNode) {
				extractKeys(arrayElement, keys);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		String jsonString = "{\"name\":\"John\",\"age\":30,\"address\":{\"city\":\"New York\",\"zip\":\"10001\"},\"phones\":[{\"type\":\"home\",\"number\":\"12345\"},{\"type\":\"mobile\",\"number\":\"67890\"}]}";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(jsonString);

		Set<String> uniqueKeys = getUniqueKeys(jsonNode);
		System.out.println("Unique Keys: " + uniqueKeys);
	}
}

class JsonNode {

	public boolean isObject() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isArray() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<Entry<String, JsonNode>> fields() {
		// TODO Auto-generated method stub
		return null;
	}

}

class ObjectMapper {

	public JsonNode readTree(String jsonString) {
		// TODO Auto-generated method stub
		return null;
	}

}
