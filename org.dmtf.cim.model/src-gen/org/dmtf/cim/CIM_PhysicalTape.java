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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Tape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The PhysicalTape class represents additional data for a Tape Media. Information on the tape length and whether it must be unloaded from BOT are properties of this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalTape#getTapeLength <em>Tape Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalTape#getUnloadAnywhere <em>Unload Anywhere</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalTape#getIsBasedOnDisk <em>Is Based On Disk</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalTape#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalTape#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Physical::PhysicalMedia' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalTape extends CIM_PhysicalMedia {
	/**
	 * Returns the value of the '<em><b>Tape Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical length of the Tape in feet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tape Length</em>' attribute.
	 * @see #setTapeLength(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape_TapeLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Feet' PUnit='foot'"
	 * @generated
	 */
	Float getTapeLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalTape#getTapeLength <em>Tape Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tape Length</em>' attribute.
	 * @see #getTapeLength()
	 * @generated
	 */
	void setTapeLength(Float value);

	/**
	 * Returns the value of the '<em><b>Unload Anywhere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean set to TRUE if the Tape can be unloaded at any position on the Media. It is set to FALSE if the tape must be at a certain position for unload - such as at the beginning of tape (BOT) area, or at mid-tape point for TapeDrives with mid-tape load.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unload Anywhere</em>' attribute.
	 * @see #setUnloadAnywhere(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape_UnloadAnywhere()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getUnloadAnywhere();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalTape#getUnloadAnywhere <em>Unload Anywhere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unload Anywhere</em>' attribute.
	 * @see #getUnloadAnywhere()
	 * @generated
	 */
	void setUnloadAnywhere(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Based On Disk</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean set to trueif the tape object represented by this instance is realized using disk storage as in the case of a Virtual Tape Library. This property is set to false if this instance is a real physical tape as in the case of a physical tape library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Based On Disk</em>' attribute.
	 * @see #setIsBasedOnDisk(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape_IsBasedOnDisk()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsBasedOnDisk();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalTape#getIsBasedOnDisk <em>Is Based On Disk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Based On Disk</em>' attribute.
	 * @see #getIsBasedOnDisk()
	 * @generated
	 */
	void setIsBasedOnDisk(Boolean value);

	/**
	 * Returns the value of the '<em><b>Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populated when "Usage" has the value of "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Usage Description</em>' attribute.
	 * @see #setOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape_OtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalTape.Usage\"]'"
	 * @generated
	 */
	String getOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalTape#getOtherUsageDescription <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Usage Description</em>' attribute.
	 * @see #getOtherUsageDescription()
	 * @generated
	 */
	void setOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, a tape element may be reserved for use by the copy service. In that case, the Usage of the element is marked as "Reserved for Copy Services". In the case of "Other", see OtherUsageDescription for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalTape_Usage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for Copy Services\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PhysicalTape.OtherUsageDescription\"]'"
	 * @generated
	 */
	Integer getUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalTape#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Integer value);

} // CIM_PhysicalTape
