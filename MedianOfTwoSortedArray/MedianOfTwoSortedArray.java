public class MedianOfTwoSortedArray {
	int firstArrStartIndex;
	int firstArrMiddleIndex;
	int firstArrEndIndex;
	int secondArrStartIndex;
	int secondArrMiddleIndex;
	int secondArrEndIndex;
	int sortIndex;
	boolean isOdd;

	int index;//
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        this.firstArrStartIndex = 0;
        this.firstArrEndIndex = nums1.length - 1;
        this.firstArrMiddleIndex = (this.firstArrStartIndex + this.firstArrEndIndex)/2;
        this.secondArrStartIndex = 0;
        this.secondArrEndIndex = nums2.length() -1;
        this.secondArrMiddleIndex = (this.secondArrStartIndex + this.secondArrEndIndex)/2;
        this.isOdd = (nums1.length+nums2.length)%2==0?false : true;
        //nums1 nums2 不重叠
       	if(nums2[secondArrEndIndex]<nums1[firstArrStartIndex]||nums2[secondArrStartIndex]>nums1[firstArrEndIndex]){
       		this.sortIndex = (nums1.length + nums2.length) / 2 - nums1.length;
       		boolean firstArrIsLargerSecond = nums1[firstArrStartIndex]>nums2[secondArrEndIndex]?true : false;
       		if(firstArrIsLargerSecond){
       			if(isOdd)
       				return sortIndex>0?nums2[sortIndex]:nums1[firstArrEndIndex + sortIndex];
       		}
       	}


    }
}