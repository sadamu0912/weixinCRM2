package com.xjxspace.model.project;
import com.xjxspace.model.frame.Record;
/**
 * <p>
 * 
 * </p>
 *
 * @author xujunxia
 * @since 2018-02-13
 */
public class Photo  extends Record {

    private static final long serialVersionUID = 1L;

	private String photoId;
	private String photoName;
    /**
     * 图片存储路径
     */
	private String photoPath;
	private String photoTypeCode;
	private String photoTypeName;
    /**
     * 关联项目id
     */
	private String relationId;
    /**
     * 关联项目类型
     */
	private String relationType;
    /**
     * 单位是kb
     */
	private Double photoSize;
	private String photoDesc;
	private Integer del;
	public String getPhotoId() {
		return photoId;
	}
	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public String getPhotoTypeCode() {
		return photoTypeCode;
	}
	public void setPhotoTypeCode(String photoTypeCode) {
		this.photoTypeCode = photoTypeCode;
	}
	public String getPhotoTypeName() {
		return photoTypeName;
	}
	public void setPhotoTypeName(String photoTypeName) {
		this.photoTypeName = photoTypeName;
	}
	public String getRelationId() {
		return relationId;
	}
	public void setRelationId(String relationId) {
		this.relationId = relationId;
	}
	public String getRelationType() {
		return relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	public Double getPhotoSize() {
		return photoSize;
	}
	public void setPhotoSize(Double photoSize) {
		this.photoSize = photoSize;
	}
	public String getPhotoDesc() {
		return photoDesc;
	}
	public void setPhotoDesc(String photoDesc) {
		this.photoDesc = photoDesc;
	}
	public Integer getDel() {
		return del;
	}
	public void setDel(Integer del) {
		this.del = del;
	}



	
}
