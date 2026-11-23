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
 * A representation of the model object '<em><b>CIM IPsec Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPsecAction specifies the parameters to use for an IPsec phase 2 negotiation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getUsePFS <em>Use PFS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getUsePhase1Group <em>Use Phase1 Group</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getGranularity <em>Granularity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecAction#getOtherGranularity <em>Other Granularity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_IPsecAction extends CIM_SANegotiationAction {
	/**
	 * Returns the value of the '<em><b>Use PFS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsePFS indicates whether perfect forward secrecy is required when refreshing keys.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use PFS</em>' attribute.
	 * @see #setUsePFS(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_UsePFS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction.UsePFS\"]' ModelCorrespondence='[\"CIM_IPsecSAEndpoint.PFSInUse\"]'"
	 * @generated
	 */
	Boolean getUsePFS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getUsePFS <em>Use PFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use PFS</em>' attribute.
	 * @see #getUsePFS()
	 * @generated
	 */
	void setUsePFS(Boolean value);

	/**
	 * Returns the value of the '<em><b>Use Phase1 Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsePhase1Group indicates that the phase 2 GroupId should be the same as that used in the phase 1 key exchange. If UsePFS is False, then this property is ignored. Note that a value of False indicates that the property GroupId will contain the key exchange group to use for phase 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Phase1 Group</em>' attribute.
	 * @see #setUsePhase1Group(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_UsePhase1Group()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction.UseIKEGroup\"]'"
	 * @generated
	 */
	Boolean getUsePhase1Group();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getUsePhase1Group <em>Use Phase1 Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Phase1 Group</em>' attribute.
	 * @see #getUsePhase1Group()
	 * @generated
	 */
	void setUsePhase1Group(Boolean value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GroupId specifies the PFS group ID to use. This value is only used if PFS is True and UsePhase1Group is False. If the GroupID number is from the vendor-specific range (32768-65535), the VendorID qualifies the group number. Well-known group identifiers from RFC2412, Appendix E, are: Group 1='768 bit prime', Group 2='1024 bit prime', Group 3='Elliptic Curve Group with 155 bit field element', Group 4='Large Elliptic Curve Group with 185 bit field element', and Group 5='1536 bit prime'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_GroupId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"No Group/Non-Diffie-Hellman Exchange\",\"DH-768 bit prime\",\"DH-1024 bit prime\",\"EC2N-155 bit field element\",\"EC2N-185 bit field element\",\"DH-1536 bit prime\",\"Standard Group - Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction.GroupID\",\"RFC2412.IETF|Appendix E\"]' ModelCorrespondence='[\"CIM_IPsecAction.VendorID\",\"CIM_IKESAEndpoint.GroupID\"]'"
	 * @generated
	 */
	Integer getGroupId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property VendorID is used together with the property GroupID (when it is in the vendor-specific range) to identify the key exchange group. VendorID is ignored unless UsePFS is true, AND UsePhase1Group is False, AND GroupID is in the vendor-specific range (32768-65535).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction.VendorID\"]' ModelCorrespondence='[\"CIM_IPsecAction.GroupId\",\"CIM_IKESAEndpoint.VendorID\"]'"
	 * @generated
	 */
	String getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(String value);

	/**
	 * Returns the value of the '<em><b>Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property Granularity is an enumeration that specifies how the selector for the SA should be derived from the traffic that triggered the negotiation. Its values are: 
	 * 1=Other; See the OtherGranularity property for more information 
	 * 2=Subnet; The source and destination subnet masks are used 
	 * 3=Address; The source and destination IP addresses of the triggering packet are used 
	 * 4=Protocol; The source and destination IP addresses and the IP protocol of the triggering packet are used 
	 * 5=Port; The source and destination IP addresses, IP protocol and the source and destination layer 4 ports of the triggering packet are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Granularity</em>' attribute.
	 * @see #setGranularity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_Granularity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Subnet\",\"Address\",\"Protocol\",\"Port\"]' MappingStrings='[\"IPSP Policy Model.IETF|IPsecAction.Granularity\"]' ModelCorrespondence='[\"CIM_IPsecAction.OtherGranularity\"]'"
	 * @generated
	 */
	Integer getGranularity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getGranularity <em>Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Granularity</em>' attribute.
	 * @see #getGranularity()
	 * @generated
	 */
	void setGranularity(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the granularity when the value 1 ("Other") is specified for the property, Granularity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Granularity</em>' attribute.
	 * @see #setOtherGranularity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecAction_OtherGranularity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPsecAction.Granularity\"]'"
	 * @generated
	 */
	String getOtherGranularity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecAction#getOtherGranularity <em>Other Granularity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Granularity</em>' attribute.
	 * @see #getOtherGranularity()
	 * @generated
	 */
	void setOtherGranularity(String value);

} // CIM_IPsecAction
