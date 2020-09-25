package org.kosta.model;

public class PostVO {
		private String pno;
		private String ptitle;
		private String pcontent;
		private int pcount;
		private String time_posted;
		private MemberVO memberVO;
		public PostVO(String pno, String ptitle, String pcontent, int pcount, String time_posted, 	MemberVO memberVO) {
			super();
			this.pno = pno;
			this.ptitle = ptitle;
			this.pcontent = pcontent;
			this.pcount = pcount;
			this.time_posted = time_posted;
			this.memberVO = memberVO;
		}
		public String getPno() {
			return pno;
		}
		public void setPno(String pno) {
			this.pno = pno;
		}
		public String getPtitle() {
			return ptitle;
		}
		public void setPtitle(String ptitle) {
			this.ptitle = ptitle;
		}
		public String getPcontent() {
			return pcontent;
		}
		public void setPcontent(String pcontent) {
			this.pcontent = pcontent;
		}
		public int getPcount() {
			return pcount;
		}
		public void setPcount(int pcount) {
			this.pcount = pcount;
		}
		public String getTime_posted() {
			return time_posted;
		}
		public void setTime_posted(String time_posted) {
			this.time_posted = time_posted;
		}
		public MemberVO getMemberVO() {
			return memberVO;
		}
		public void setMemberVO(MemberVO memberVO) {
			this.memberVO = memberVO;
		}
		@Override
		public String toString() {
			return "PostVO [pno=" + pno + ", ptitle=" + ptitle + ", pcontent=" + pcontent + ", pcount=" + pcount
					+ ", time_posted=" + time_posted + ", memberVO=" + memberVO + "]";
		}
		
}
