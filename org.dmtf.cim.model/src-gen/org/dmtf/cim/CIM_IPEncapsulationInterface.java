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
 * A representation of the model object '<em><b>CIM IP Encapsulation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IPEncapsulationInterface specializes CIM_IPProtocolEndpoint to provide the additional configuration properties required for an IP tunnel interface. 
 * The IPProtocolEndpoint properties represent the inner IP address of the IP packet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getCAVRFContext <em>CAVRF Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getCASourceEndpoint <em>CA Source Endpoint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getPAVRFContext <em>PAVRF Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getPASourceEndpoint <em>PA Source Endpoint</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.52.0' UMLPackagePath='CIM::Network::Protocol Endpoint(1)' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.\nTo ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nIf not set to null for DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPEncapsulationInterface extends CIM_ManagedSystemElement {
	/**
	 * Returns the value of the '<em><b>Encapsulation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1- sets the Encapsulation mode typeOther - should only be used if there is not an enumerated value
	 * 2- GRE
	 * 3- IP-in-IP
	 * 4-NVGRE
	 * 5-VXLAN 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Mode</em>' attribute.
	 * @see #setEncapsulationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_EncapsulationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Other\",\"GRE\",\"IP-in-IP\",\"NVGRE\",\"VXLAN\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IPEncapsulationInterface.OtherEncapsulationMode\"]'"
	 * @generated
	 */
	Integer getEncapsulationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getEncapsulationMode <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulation Mode</em>' attribute.
	 * @see #getEncapsulationMode()
	 * @generated
	 */
	void setEncapsulationMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Encapsulation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if the EncapsulationMode has a value 1 - OtherOtherEncapsulationMode should have a string describing the tunnel mode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encapsulation Mode</em>' attribute.
	 * @see #setOtherEncapsulationMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_OtherEncapsulationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPEncapsulationInterface.EncapsulationMode\"]'"
	 * @generated
	 */
	String getOtherEncapsulationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encapsulation Mode</em>' attribute.
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 */
	void setOtherEncapsulationMode(String value);

	/**
	 * Returns the value of the '<em><b>CAVRF Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an optional property for configuring the Virtual Routing and Forwarding table (a CIM_VirtualRoutingAndForwarding instance) to be used to look up the route for a customer IP address from a de-capsulated packet coming from the overlay network. A non-null value of this property shall be formated as a URI per RFC3986. If this resource is modeled then a value should be a WBEM URI (DSP0207).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAVRF Context</em>' attribute.
	 * @see #setCAVRFContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_CAVRFContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCAVRFContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getCAVRFContext <em>CAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAVRF Context</em>' attribute.
	 * @see #getCAVRFContext()
	 * @generated
	 */
	void setCAVRFContext(String value);

	/**
	 * Returns the value of the '<em><b>CA Source Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the identifier for the source endpoint traffic from the customer network. It shall be an instance of CIM_ProtocolEndpoint, for this IP Tunnel a non-null value of the CASourceEndpont property shall be formatted as a URI per RFC3986. If this resource is modeled then a value should be a WBEM URI (DSP0207).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Source Endpoint</em>' attribute.
	 * @see #setCASourceEndpoint(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_CASourceEndpoint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCASourceEndpoint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getCASourceEndpoint <em>CA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Source Endpoint</em>' attribute.
	 * @see #getCASourceEndpoint()
	 * @generated
	 */
	void setCASourceEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>PAVRF Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an optional property for configuring the Virtual Routing and Forwarding table (a CIM_VirtualRoutingAndForwarding instance) to be used to look up the route for a Provide IP address from a encapsulated packet coming from the overlay network. A non-null value of this property shall shall be formated as a URI per RFC3986. If this resource is modeled then a value should be a WBEM URI (DSP0207)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PAVRF Context</em>' attribute.
	 * @see #setPAVRFContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_PAVRFContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPAVRFContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getPAVRFContext <em>PAVRF Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAVRF Context</em>' attribute.
	 * @see #getPAVRFContext()
	 * @generated
	 */
	void setPAVRFContext(String value);

	/**
	 * Returns the value of the '<em><b>PA Source Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the identifier for the source endpoint traffic to the Provider (overlay) network. It shall be an instance of CIM_ProtocolEndpoint, for this IP Tunnel a non-null value of the PASourceEndpont property shall be formatted as a URI per RFC3986. If this resource is modeled then a value should be a WBEM URI (DSP0207).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PA Source Endpoint</em>' attribute.
	 * @see #setPASourceEndpoint(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPEncapsulationInterface_PASourceEndpoint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPASourceEndpoint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPEncapsulationInterface#getPASourceEndpoint <em>PA Source Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PA Source Endpoint</em>' attribute.
	 * @see #getPASourceEndpoint()
	 * @generated
	 */
	void setPASourceEndpoint(String value);

} // CIM_IPEncapsulationInterface
