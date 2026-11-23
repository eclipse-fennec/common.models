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
 * A representation of the model object '<em><b>CIM Storage Media Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageMediaLocation is a PackageLocation where PhysicalMedia may be placed. This class is typically used in the context of a StorageLibrary. Examples of StorageMediaLocations are Media AccessDevices, InterLibraryPorts or 'slots' in a Library's panel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageMediaLocation#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageMediaLocation#getMediaTypesSupported <em>Media Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageMediaLocation#getMediaSizesSupported <em>Media Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageMediaLocation#getMediaCapacity <em>Media Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageMediaLocation#getTypeDescriptions <em>Type Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Physical::StoragePackage' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_StorageMediaLocation extends CIM_PackageLocation {
	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of Location. For example, whether this is an individual Media "Slot" (value=2), a MediaAccessDevice (value=4) or a "Magazine" (value=3) is indicated in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Type</em>' attribute.
	 * @see #setLocationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation_LocationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Unknown\",\"Other\",\"Slot\",\"Magazine\",\"MediaAccessDevice\",\"InterLibrary Port\",\"Limited Access Port\",\"Door\",\"Shelf\",\"Vault\"]'"
	 * @generated
	 */
	Integer getLocationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageMediaLocation#getLocationType <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' attribute.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Media Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certain StorageMediaLocations may only be able to accept a limited set of PhysicalMedia MediaTypes. This property defines an array containing the types of Media that are acceptable for placement in the Location. Additional information and description of the contained MediaTypes can be provided using the TypesDescription array. Also, size data (for example, DVD disc diameter) can be specified using the MediaSizesSupported array. 
	 * 
	 * Values defined here correspond to those in the CIM_Physical Media.MediaType property. This allows quick comparisons using value equivalence calculations. It is understood that there is no external physical difference between (for example) DVD- Video and DVD-RAM. But, equivalent values in both the Physical Media and StorageMediaLocation enumerations allows for one for one comparisons with no additional processing logic (i.e., the following is not required ... if "DVD-Video" then value="DVD").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation_MediaTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\"]' Values='[\"Unknown\",\"Other\",\"Tape Cartridge\",\"QIC Cartridge\",\"AIT Cartridge\",\"DTF Cartridge\",\"DAT Cartridge\",\"8mm Tape Cartridge\",\"19mm Tape Cartridge\",\"DLT Cartridge\",\"Half-Inch Magnetic Tape Cartridge\",\"Cartridge Disk\",\"JAZ Disk\",\"ZIP Disk\",\"SyQuest Disk\",\"Winchester Removable Disk\",\"CD-ROM\",\"CD-ROM/XA\",\"CD-I\",\"CD Recordable\",\"WORM\",\"Magneto-Optical\",\"DVD\",\"DVD-RW+\",\"DVD-RAM\",\"DVD-ROM\",\"DVD-Video\",\"Divx\",\"Floppy/Diskette\",\"Hard Disk\",\"Memory Card\",\"Hard Copy\",\"Clik Disk\",\"CD-RW\",\"CD-DA\",\"CD+\",\"DVD Recordable\",\"DVD-RW\",\"DVD-Audio\",\"DVD-5\",\"DVD-9\",\"DVD-10\",\"DVD-18\",\"Magneto-Optical Rewriteable\",\"Magneto-Optical Write Once\",\"Magneto-Optical Rewriteable (LIMDOW)\",\"Phase Change Write Once\",\"Phase Change Rewriteable\",\"Phase Change Dual Rewriteable\",\"Ablative Write Once\",\"Near Field Recording\",\"MiniQic\",\"Travan\",\"8mm Metal Particle\",\"8mm Advanced Metal Evaporate\",\"NCTP\",\"LTO Ultrium\",\"LTO Accelis\",\"9 Track Tape\",\"18 Track Tape\",\"36 Track Tape\",\"Magstar 3590\",\"Magstar MP\",\"D2 Tape\",\"Tape - DST Small\",\"Tape - DST Medium\",\"Tape - DST Large\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalMedia.MediaType\",\"CIM_StorageMediaLocation.MediaSizesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getMediaTypesSupported();

	/**
	 * Returns the value of the '<em><b>Media Sizes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sizes (in inches) of the particular MediaTypes that may be placed in the Location. Note, each entry of this array is related to the entry in the MediaTypesSupported array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Sizes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation_MediaSizesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='real32[]' Units='Inches' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PhysicalMedia.MediaType\",\"CIM_StorageMediaLocation.MediaSizesSupported\",\"CIM_StorageMediaLocation.TypeDescriptions\"]' PUnit='inch'"
	 * @generated
	 */
	EList<Float> getMediaSizesSupported();

	/**
	 * Returns the value of the '<em><b>Media Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A StorageMediaLocation may hold more than one PhysicalMedia - for example, a Magazine. This property indicates the Physical Media capacity of the Location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Capacity</em>' attribute.
	 * @see #setMediaCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation_MediaCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMediaCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageMediaLocation#getMediaCapacity <em>Media Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Capacity</em>' attribute.
	 * @see #getMediaCapacity()
	 * @generated
	 */
	void setMediaCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Type Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides additional detail related to the entries in the MediaTypesSupported array. This is especially critical when the MediaTypesSupported value is 1 ("Other"). Note, each entry of this array is related to the entry in MediaTypesSupported that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageMediaLocation_TypeDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_StorageMediaLocation.MediaTypesSupported\"]'"
	 * @generated
	 */
	EList<String> getTypeDescriptions();

} // CIM_StorageMediaLocation
