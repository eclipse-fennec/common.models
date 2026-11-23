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
 * A representation of the model object '<em><b>CIM SA Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SATransform is the base class for the various types of transforms that are in effect for an existing IPsecSAEndpoint, or aggregated into phase 2 proposals used during the IPsec negotiation process. This class is defined as a kind of ScopedSettingData, since it describes the set of transform properties that MUST be applied together, if negotiated. This subclassing is different than that defined in IETF's IPSP Policy draft - where it is subclassed from Policy. The definition as SettingData is more consistent with the application of the properties as a set, to the negotiated Security Association. 
 * 
 * Note that an instance of this class is 'scoped' or contained by a System (either a ComputerSystem or AdminDomain), rather than by a SecurityAssociationEndpoint. This is indicated by instantiating the ScopedSetting association, and is necessary since the transform data is used in IPsec negotiation policies (also scoped by Systems) before ever being associated with a SecurityAssociationEndpoint. The latter semantics (i.e., that 'this' transform is negotiated for 'this' Security Association) is conveyed via a subclass of ElementSettingData, TransformOfSecurityAssociation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SATransform#getMaxLifetimeSeconds <em>Max Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SATransform#getMaxLifetimeKilobytes <em>Max Lifetime Kilobytes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SATransform#getVendorID <em>Vendor ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SATransform()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' MappingStrings='[\"IPSP Model.IETF|SATransform\"]' override.ElementName='string' override.ElementName.MappingStrings='[\"IPSP Model.IETF|SATransform.CommonName\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SATransform extends CIM_ScopedSettingData {
	/**
	 * Returns the value of the '<em><b>Max Lifetime Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxLifetimeSeconds specifies the maximum time that the Security Association should be considered valid after it has been created. A value of 0, the default, indicates that 8 hours should be used. A non-zero value indicates the maximum lifetime in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Lifetime Seconds</em>' attribute.
	 * @see #setMaxLifetimeSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SATransform_MaxLifetimeSeconds()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' MappingStrings='[\"IPSP Model.IETF|SATransform.MaxLifetimeSeconds\"]' PUnit='second'"
	 * @generated
	 */
	Long getMaxLifetimeSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SATransform#getMaxLifetimeSeconds <em>Max Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lifetime Seconds</em>' attribute.
	 * @see #getMaxLifetimeSeconds()
	 * @generated
	 */
	void setMaxLifetimeSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Max Lifetime Kilobytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxLifetimeKilobytes specifies the maximum kilobyte lifetime for a Security Association. Different lifetimes are used, depending on the strength of the encryption algorithm. A value of 0, the default, indicates that no maximum should be defined. A non-zero value specifies the desired kilobyte lifetime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Lifetime Kilobytes</em>' attribute.
	 * @see #setMaxLifetimeKilobytes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SATransform_MaxLifetimeKilobytes()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"IPSP Model.IETF|SATransform.MaxLifetimeKilobytes\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getMaxLifetimeKilobytes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SATransform#getMaxLifetimeKilobytes <em>Max Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lifetime Kilobytes</em>' attribute.
	 * @see #getMaxLifetimeKilobytes()
	 * @generated
	 */
	void setMaxLifetimeKilobytes(Long value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VendorID identifies vendor-defined transforms. If this field is empty (the default), then this is a standard transform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SATransform_VendorID()
	 * @model default=""
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"IPSP Model.IETF|SATransform.VendorID\"]'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SATransform#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

} // CIM_SATransform
