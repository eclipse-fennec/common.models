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
 * A representation of the model object '<em><b>CIM iSCSI Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The capabilites for an iSCSI Network Entity. An instance of this class will be associated by ElementCapabilities to a instance of ComputerSystem that represents the Network Entity. These capability properties are associated to a Network Entity/ComputerSystem since they affect all login negotiations on all iSCSI ProtocolEndpoints aggregated to the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_iSCSICapabilities#getMinimumSpecificationVersionSupported <em>Minimum Specification Version Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSICapabilities#getMaximumSpecificationVersionSupported <em>Maximum Specification Version Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSICapabilities#getAuthenticationMethodsSupported <em>Authentication Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSICapabilities#getOtherSupportedFeatures <em>Other Supported Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_iSCSICapabilities#getSupportedFeatures <em>Supported Features</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Network::iSCSI' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_iSCSICapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Minimum Specification Version Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum version number of the iSCSI specification such that this iSCSI instance supports this minimum value, the maximum value indicated by the corresponding property MaximumSpecificationVersionSupported, and all versions in between.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Specification Version Supported</em>' attribute.
	 * @see #setMinimumSpecificationVersionSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities_MinimumSpecificationVersionSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='255' MappingStrings='[\"MIB.IETF|iSCSI-MIB.iscsiInstVersionMin\"]' ModelCorrespondence='[\"CIM_iSCSICapabilities.MaximumSpecificationVersionSupported\",\"CIM_iSCSIConnection.ActiveiSCSIVersion\"]'"
	 * @generated
	 */
	Integer getMinimumSpecificationVersionSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSICapabilities#getMinimumSpecificationVersionSupported <em>Minimum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Specification Version Supported</em>' attribute.
	 * @see #getMinimumSpecificationVersionSupported()
	 * @generated
	 */
	void setMinimumSpecificationVersionSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Specification Version Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum version number of the iSCSI specification such that this iSCSI instance supports this maximum value, the minimum value indicated by the corresponding property MinimumSpecificationVersionSupported, and all versions in between.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Specification Version Supported</em>' attribute.
	 * @see #setMaximumSpecificationVersionSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities_MaximumSpecificationVersionSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='255' MappingStrings='[\"MIB.IETF|ISCSI-MIB.iscsiInstVersionMax\"]' ModelCorrespondence='[\"CIM_iSCSICapabilities.MinimumSpecificationVersionSupported\",\"CIM_iSCSIConnection.ActiveiSCSIVersion\"]'"
	 * @generated
	 */
	Integer getMaximumSpecificationVersionSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_iSCSICapabilities#getMaximumSpecificationVersionSupported <em>Maximum Specification Version Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Specification Version Supported</em>' attribute.
	 * @see #getMaximumSpecificationVersionSupported()
	 * @generated
	 */
	void setMaximumSpecificationVersionSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Authentication Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array containing a list of authentication methods supported by this Network Entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authentication Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities_AuthenticationMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"(None\",\"SRP\",\"CHAP\",\"Kerberos\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|IPS-AUTH-MIB.ipsAuthCredAuthMethod\"]' ModelCorrespondence='[\"CIM_iSCSIConnectionSettings.PrimaryAuthenticationMethod\",\"CIM_iSCSIConnectionSettings.SecondaryAuthenticationMethod\",\"CIM_iSCSIConnection.AuthenticationMethodUsed\"]'"
	 * @generated
	 */
	EList<Integer> getAuthenticationMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Other Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the additional supported features of the Network Entity, used when the corresponding SupportedFeatures array element is set to the value "1" (Other). Each element that corresponds to a SupportedFeatures array element with a value other than "1" (Other) shall have a value of NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities_OtherSupportedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_iSCSICapabilities.SupportedFeatures\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating features that are supported by the Network Entity. Since this is an array, multiple values may be specified. The current values in the enumeration are:
	 * 0 = "None", indicating that no features are supported. If this value is present in the array, it shall be the only value.
	 * 1 = "Other", indicating that a feature not described by another value is present. A description of the capability can be found in the OtherSupportedFeatures property. "Other" can be present more than once in the SupportedFeatures array.
	 * 2 = "iSCSI Session", indication that the Network Entity supports iSCSI sessions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_iSCSICapabilities_SupportedFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"None\",\"Other\",\"iSCSI Session\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedFeatures();

} // CIM_iSCSICapabilities
