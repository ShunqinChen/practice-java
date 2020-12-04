package lol.kent.practice.guava.bus;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年12月04日 16:33
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class EventMessage {

    private String sourceId;

    private Integer count;

    public EventMessage() {
    }

    public EventMessage(String sourceId, Integer count) {
        this.sourceId = sourceId;
        this.count = count;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
