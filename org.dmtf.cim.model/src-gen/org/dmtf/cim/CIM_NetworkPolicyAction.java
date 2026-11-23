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
 * A representation of the model object '<em><b>CIM Network Policy Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class describes the network policy action.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyAction#getActionType <em>Action Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NetworkPolicyAction#getActionTypeValue <em>Action Type Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.53.0' UMLPackagePath='CIM::Network' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.\nTo ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nIf not set to null for DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NetworkPolicyAction extends CIM_Policy {
	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This describes the type of network policy action. If a specific action as defined by an element of this array requires additional information, then it is contained in the corresponding indexed array element of ActionTypeValue.
	 * Permit: this action allows the passing of the corresponding packet. 
	 * Deny: this action drops the packet. 
	 * LoadBalance: this action implies the application of load balancing rules. 
	 * ForwardOnly: implies the traffic forwarding to the destination. 
	 * Persistence: this action implies the application of a persistence policy. The LoadBalancingActionSettingData may provide extra configuration information for this action. 
	 * HealthCheck: this action implies the application of a health check policy. The LoadBalancingActionSettingData may provide extra configuration information for this action.
	 * RewriteHTTPHeader: this action implies to rewrite a HTTP Header inside the HTTP traffic. 
	 * InsertHTTPHeader: this action implies the insertion of a HTTP header inside the HTTP traffic. 
	 * CompressHTTP: this action implies the compression of the HTTP traffic. 
	 * SSLProxy: this action implies the application of SSL to the corresponding HTTP connection. 
	 * SourceNAT: this action implies that the origin address of the request is translated. 
	 * DestinationNAT: this action implies that the destination address of the request is translated. 
	 * SourceAndDestinationNAT: this action implies that the origin and destination addresses of the request are translated. 
	 * DirectRouting: this action implies the application of Direct Routing request dispatching techniques, the server sends the response directly to the sender. 
	 * PortTranslation: this action implies the application of port address translation techniques.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyAction_ActionType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"..\",\"32767..65535\"]' Values='[\"Other\",\"Permit\",\"Deny\",\"LoadBalance\",\"ForwardOnly\",\"Persistence\",\"HealthCheck\",\"RewriteHTTPHeader\",\"InsertHTTPHeader\",\"CompressHTTP\",\"SSLProxy\",\"SourceNAT\",\"DestinationNAT\",\"SourceAndDestinationNAT\",\"DirectRouting\",\"PortTranslation\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NetworkPolicyAction.ActionTypeValue\"]'"
	 * @generated
	 */
	EList<Integer> getActionType();

	/**
	 * Returns the value of the '<em><b>Action Type Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An element of this array may not be NULL if the corresponding ActionType array element contains value "Persistence", "InsertHTTPHeader", "DeleteHTTPHeader", or "CompressHTTP". An element of this array contains HTTP header name if the corresponding ActionType array element contains value "InsertHTTPHeader", "DeleteHTTPHeader", or "CompressHTTP". An element of this array contains cookie name if the corresponding ActionType array element contains value "Persistence".
	 * ActionTypeValue for "Persistent" ActionType may contain a cookie name or HTTP header in the corresponding ActionTypeValue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Type Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_NetworkPolicyAction_ActionTypeValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NetworkPolicyAction.ActionType\"]'"
	 * @generated
	 */
	EList<String> getActionTypeValue();

} // CIM_NetworkPolicyAction
