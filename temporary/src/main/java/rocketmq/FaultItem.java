package rocketmq;

/**
 * FaultItem
 *
 * @author kq
 * @date 2021/7/6 23:27
 * @since 1.0.0
 */
public class FaultItem implements Comparable<FaultItem> {
    private final String name;
    private volatile long currentLatency;
    private volatile long startTimestamp;

    public FaultItem(final String name) {
        this.name = name;
    }

    @Override
    public int compareTo(final FaultItem other) {
        if (this.isAvailable() != other.isAvailable()) {
            if (this.isAvailable())
                return -1;

            if (other.isAvailable())
                return 1;
        }

        if (this.currentLatency < other.currentLatency)
            return -1;
        else if (this.currentLatency > other.currentLatency) {
            return 1;
        }

        if (this.startTimestamp < other.startTimestamp)
            return -1;
        else if (this.startTimestamp > other.startTimestamp) {
            return 1;
        }

        return 0;
    }

    public boolean isAvailable() {
        return (System.currentTimeMillis() - startTimestamp) >= 0;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (int) (getCurrentLatency() ^ (getCurrentLatency() >>> 32));
        result = 31 * result + (int) (getStartTimestamp() ^ (getStartTimestamp() >>> 32));
        return result;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof FaultItem))
            return false;

        final FaultItem faultItem = (FaultItem) o;

        if (getCurrentLatency() != faultItem.getCurrentLatency())
            return false;
        if (getStartTimestamp() != faultItem.getStartTimestamp())
            return false;
        return getName() != null ? getName().equals(faultItem.getName()) : faultItem.getName() == null;

    }

    @Override
    public String toString() {
        return "FaultItem{" +
                "name='" + name + '\'' +
                ", currentLatency=" + currentLatency +
                ", startTimestamp=" + startTimestamp +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getCurrentLatency() {
        return currentLatency;
    }

    public void setCurrentLatency(final long currentLatency) {
        this.currentLatency = currentLatency;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(final long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

}
