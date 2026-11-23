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
 * A representation of the model object '<em><b>CIM Enabled Logical Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EnabledLogicalElementCapabilities describes the capabilities supported for changing the state of the assciated EnabledLogicalElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getElementNameEditSupported <em>Element Name Edit Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getMaxElementNameLen <em>Max Element Name Len</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getRequestedStatesSupported <em>Requested States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getElementNameMask <em>Element Name Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getStateAwareness <em>State Awareness</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_EnabledLogicalElementCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Element Name Edit Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the ElementName can be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name Edit Supported</em>' attribute.
	 * @see #setElementNameEditSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities_ElementNameEditSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|EditName\"]' ModelCorrespondence='[\"CIM_ManagedElement.ElementName\"]'"
	 * @generated
	 */
	Boolean getElementNameEditSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getElementNameEditSupported <em>Element Name Edit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name Edit Supported</em>' attribute.
	 * @see #getElementNameEditSupported()
	 * @generated
	 */
	void setElementNameEditSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Element Name Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum supported ElementName length.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Element Name Len</em>' attribute.
	 * @see #setMaxElementNameLen(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities_MaxElementNameLen()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MaxValue='256' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_UNIT_CONFIG_CAPS_T|MaxNameChars\"]' ModelCorrespondence='[\"CIM_FCSwitchCapabilities.ElementNameEditSupported\",\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'"
	 * @generated
	 */
	Integer getMaxElementNameLen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getMaxElementNameLen <em>Max Element Name Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Element Name Len</em>' attribute.
	 * @see #getMaxElementNameLen()
	 * @generated
	 */
	void setMaxElementNameLen(Integer value);

	/**
	 * Returns the value of the '<em><b>Requested States Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested States Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities_RequestedStatesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Enabled\",\"Disabled\",\"Shut Down\",\"Offline\",\"Test\",\"Defer\",\"Quiesce\",\"Reboot\",\"Reset\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.RequestStateChange\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedStatesSupported();

	/**
	 * Returns the value of the '<em><b>Element Name Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This string expresses the restrictions on ElementName.The mask is expressed as a regular expression.See DMTF standard ABNF with the Management Profile Specification Usage Guide, appendix C for the regular expression syntax permitted. 
	 * Since the ElementNameMask can describe the maximum length of the ElementName,any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length)The ElementName value satisfies the restriction, if and only if it matches the regular expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Name Mask</em>' attribute.
	 * @see #setElementNameMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities_ElementNameMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'"
	 * @generated
	 */
	String getElementNameMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElementCapabilities#getElementNameMask <em>Element Name Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name Mask</em>' attribute.
	 * @see #getElementNameMask()
	 * @generated
	 */
	void setElementNameMask(String value);

	/**
	 * Returns the value of the '<em><b>State Awareness</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StateAwareness indicates support for modeling the state of the associated instance of CIM_EnabledLogicalElement. 
	 * If StateAwareness contains the value 2 "Implicit", the RequestedState and TransitioningToState properties of the associated instance of CIM_EnabledLogicalElement shall provide information about state transitions that were initiated through a mechanism other than invocation of the RequestStateChange() method. 
	 * If StateAwareness contains the value 3 "RequestStateChange", the RequestedState and TransitioningToState properties of the associated instance of CIM_EnabledLogicalElement shall provide information about state transitions initiated by invocation of the RequestStateChange() method. 
	 * A value of NULL or an array that contains zero elements shall indicate the RequestedState and TransitioningToState properties will not reflect any transitions, irrespective of how they are initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Awareness</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElementCapabilities_StateAwareness()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\"]' Values='[\"Implicit\",\"RequestStateChange\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getStateAwareness();

} // CIM_EnabledLogicalElementCapabilities
