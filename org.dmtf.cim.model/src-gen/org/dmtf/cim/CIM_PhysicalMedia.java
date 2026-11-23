/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalMedia class represents any type of documentation or storage medium, such as tapes, CDROMs, etc. This class is typically used to locate and manage Removable Media (versus Media sealed with the MediaAccessDevice, as a single Package, as is the case with hard disks). However, 'sealed' Media can also be modeled using this class, where the Media would then be associated with the PhysicalPackage using the PackagedComponent relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaDescription <em>Media Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getWriteProtectOn <em>Write Protect On</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getCleanerMedia <em>Cleaner Media</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaSize <em>Media Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getMaxMounts <em>Max Mounts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getMountCount <em>Mount Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getDualSided <em>Dual Sided</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getPhysicalLabels <em>Physical Labels</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getLabelStates <em>Label States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getLabelFormats <em>Label Formats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getTimeOfLastMount <em>Time Of Last Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMedia#getTotalMountTime <em>Total Mount Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Physical::PhysicalMedia' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalMedia extends CIM_PhysicalComponent {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes that can be read from or written to a Media. This property is not applicable to "Hard Copy" (documentation) or cleaner Media. Data compression should not be assumed, as it would increase the value in this property. For tapes, it should be assumed that no filemarks or blank space areas are recorded on the Media.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_Capacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the type of the PhysicalMedia, as an enumerated integer. The MediaDescription property is used to provide more explicit definition of the Media type, whether it is pre-formatted, compatability features, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_MediaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\"]' Values='[\"Unknown\",\"Other\",\"Tape Cartridge\",\"QIC Cartridge\",\"AIT Cartridge\",\"DTF Cartridge\",\"DAT Cartridge\",\"8mm Tape Cartridge\",\"19mm Tape Cartridge\",\"DLT Cartridge\",\"Half-Inch Magnetic Tape Cartridge\",\"Cartridge Disk\",\"JAZ Disk\",\"ZIP Disk\",\"SyQuest Disk\",\"Winchester Removable Disk\",\"CD-ROM\",\"CD-ROM/XA\",\"CD-I\",\"CD Recordable\",\"WORM\",\"Magneto-Optical\",\"DVD\",\"DVD-RW+\",\"DVD-RAM\",\"DVD-ROM\",\"DVD-Video\",\"Divx\",\"Floppy/Diskette\",\"Hard Disk\",\"Memory Card\",\"Hard Copy\",\"Clik Disk\",\"CD-RW\",\"CD-DA\",\"CD+\",\"DVD Recordable\",\"DVD-RW\",\"DVD-Audio\",\"DVD-5\",\"DVD-9\",\"DVD-10\",\"DVD-18\",\"Magneto-Optical Rewriteable\",\"Magneto-Optical Write Once\",\"Magneto-Optical Rewriteable (LIMDOW)\",\"Phase Change Write Once\",\"Phase Change Rewriteable\",\"Phase Change Dual Rewriteable\",\"Ablative Write Once\",\"Near Field Recording\",\"MiniQic\",\"Travan\",\"8mm Metal Particle\",\"8mm Advanced Metal Evaporate\",\"NCTP\",\"LTO Ultrium\",\"LTO Accelis\",\"9 Track Tape\",\"18 Track Tape\",\"36 Track Tape\",\"Magstar 3590\",\"Magstar MP\",\"D2 Tape\",\"Tape - DST Small\",\"Tape - DST Medium\",\"Tape - DST Large\"]' ModelCorrespondence='[\"CIM_PhysicalMedia.MediaDescription\"]'"
	 * @generated
	 */
	Integer getMediaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(Integer value);

	/**
	 * Returns the value of the '<em><b>Media Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional detail related to the MediaType enumeration. For example, if value 3 ("QIC Cartridge") is specified, this property could indicate whether the tape is wide or 1/4 inch, whether it is pre-formatted, whether it is Travan compatible, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Description</em>' attribute.
	 * @see #setMediaDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_MediaDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalMedia.MediaType\"]'"
	 * @generated
	 */
	String getMediaDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaDescription <em>Media Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Description</em>' attribute.
	 * @see #getMediaDescription()
	 * @generated
	 */
	void setMediaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Write Protect On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean specifying whether the Media is currently write protected by some kind of physical mechanism, such as a protect tab on a floppy diskette.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Protect On</em>' attribute.
	 * @see #setWriteProtectOn(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_WriteProtectOn()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getWriteProtectOn();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getWriteProtectOn <em>Write Protect On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Protect On</em>' attribute.
	 * @see #getWriteProtectOn()
	 * @generated
	 */
	void setWriteProtectOn(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cleaner Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the PhysicalMedia is used for cleaning purposes and not data storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cleaner Media</em>' attribute.
	 * @see #setCleanerMedia(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_CleanerMedia()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCleanerMedia();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getCleanerMedia <em>Cleaner Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaner Media</em>' attribute.
	 * @see #getCleanerMedia()
	 * @generated
	 */
	void setCleanerMedia(Boolean value);

	/**
	 * Returns the value of the '<em><b>Media Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of the Media in inches. For example, '3.5' would be entered for a 3.5 inch disk, or '12' would be entered for a 12 inch optical disk. On the other hand, '0.5' would be defined for a 1/2 inch tape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Size</em>' attribute.
	 * @see #setMediaSize(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_MediaSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Inches' PUnit='inch'"
	 * @generated
	 */
	Float getMediaSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getMediaSize <em>Media Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Size</em>' attribute.
	 * @see #getMediaSize()
	 * @generated
	 */
	void setMediaSize(Float value);

	/**
	 * Returns the value of the '<em><b>Max Mounts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For removable Media, the maximum number of times that the Media can be mounted before it should be retired. For cleaner Media, this is the maximum number of Drive cleans that can be performed. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Mounts</em>' attribute.
	 * @see #setMaxMounts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_MaxMounts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getMaxMounts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getMaxMounts <em>Max Mounts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Mounts</em>' attribute.
	 * @see #getMaxMounts()
	 * @generated
	 */
	void setMaxMounts(Long value);

	/**
	 * Returns the value of the '<em><b>Mount Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For removable or cleaner Media, the number of times that the Media has been mounted for data transfer or to clean a Drive. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Count</em>' attribute.
	 * @see #setMountCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_MountCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' ModelCorrespondence='[\"CIM_PhysicalMedia.MaxMounts\"]'"
	 * @generated
	 */
	Long getMountCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getMountCount <em>Mount Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Count</em>' attribute.
	 * @see #getMountCount()
	 * @generated
	 */
	void setMountCount(Long value);

	/**
	 * Returns the value of the '<em><b>Dual Sided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Media has two recording sides (TRUE) or only a single side (FALSE). Examples of dual sided Media include DVD-ROM and some optical disks. Examples of single sided Media are tapes and CD-ROM.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dual Sided</em>' attribute.
	 * @see #setDualSided(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_DualSided()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDualSided();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getDualSided <em>Dual Sided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dual Sided</em>' attribute.
	 * @see #getDualSided()
	 * @generated
	 */
	void setDualSided(Boolean value);

	/**
	 * Returns the value of the '<em><b>Physical Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more strings on 'labels' on the PhysicalMedia. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the LabelFormats and LabelStates array properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Labels</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_PhysicalLabels()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalMedia.LabelStates\",\"CIM_PhysicalMedia.LabelFormats\"]'"
	 * @generated
	 */
	EList<String> getPhysicalLabels();

	/**
	 * Returns the value of the '<em><b>Label States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers describing the states of each of the labels on a PhysicalMedia. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_LabelStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"OK/Readable\",\"Unreadable\",\"Upside Down\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalMedia.PhysicalLabels\"]'"
	 * @generated
	 */
	EList<Integer> getLabelStates();

	/**
	 * Returns the value of the '<em><b>Label Formats</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated integers describing the formats of each of the labels on a PhysicalMedia. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Formats</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_LabelFormats()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Barcode\",\"Radio Frequency Identification\",\"OCR (Optical Character Recognition)\",\"MICR (Magnetic Ink Character Recognition)\",\"7 Character Barcode\",\"9 Character Barcode\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalMedia.PhysicalLabels\"]'"
	 * @generated
	 */
	EList<Integer> getLabelFormats();

	/**
	 * Returns the value of the '<em><b>Time Of Last Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For removable or cleaner Media, the date and time that the Media was last mounted. For nonremovable Media, such as hard disks, this property has no meaning and is not applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Mount</em>' attribute.
	 * @see #setTimeOfLastMount(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_TimeOfLastMount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastMount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getTimeOfLastMount <em>Time Of Last Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Mount</em>' attribute.
	 * @see #getTimeOfLastMount()
	 * @generated
	 */
	void setTimeOfLastMount(String value);

	/**
	 * Returns the value of the '<em><b>Total Mount Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For removable or cleaner Media, the total time (in seconds) that the Media has been mounted for data transfer or to clean a Drive. For nonremovable Media, such as hard disks, this property is not applicable and should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Mount Time</em>' attribute.
	 * @see #setTotalMountTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMedia_TotalMountTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getTotalMountTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMedia#getTotalMountTime <em>Total Mount Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Mount Time</em>' attribute.
	 * @see #getTotalMountTime()
	 * @generated
	 */
	void setTotalMountTime(Long value);

} // CIM_PhysicalMedia
