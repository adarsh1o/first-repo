package binarysearch;

class VersionControl {
    boolean isBadVersion(int x) {
        return true;
    }
}

public class Q_278_BadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1) return n;
        int high=n;
        int low=1;
        int bad=1;
        while(high>=low)
        {
            int mid=low + (high-low)/2;
            if (isBadVersion(mid))
            {
                high=mid-1;
                bad=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return bad;

    }
}
