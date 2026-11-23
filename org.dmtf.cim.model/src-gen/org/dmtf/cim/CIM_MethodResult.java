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
 * A representation of the model object '<em><b>CIM Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Jobs are sometimes used to represent extrinsic method invocations that execute for times longer than the length of time is reasonable to require a client to wait. The method executing continues beyond the method return to the client. The class provides the result of the execution of a Job that was itself started by the side-effect of this extrinsic method invocation. 
 * The indication instances embedded an instance of this class shall be the same indications delivered to listening clients or recorded, all or in part, to logs. Basically, this approach is a corollary to the functionality provided by an instance of ListenerDestinationLog (as defined in the Interop Model). The latter provides a comprehensive, persistent mechanism for recording Job results, but is also more resource-intensive and requires supporting logging functionality. Both the extra resources and logging may not be available in all environments (for example, embedded environments). Therefore, this instance-based approach is also provided. 
 * The MethodResult instances shall not exist after the associated ConcreteJob is deleted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MethodResult#getPreCallIndication <em>Pre Call Indication</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MethodResult#getPostCallIndication <em>Post Call Indication</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MethodResult()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.0' UMLPackagePath='CIM::System::Processing' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MethodResult extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Pre Call Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains a CIM_InstMethodCall Indication that describes the pre-execution values of the extrinisic method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Call Indication</em>' attribute.
	 * @see #setPreCallIndication(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodResult_PreCallIndication()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_InstMethodCall'"
	 * @generated
	 */
	String getPreCallIndication();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodResult#getPreCallIndication <em>Pre Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Call Indication</em>' attribute.
	 * @see #getPreCallIndication()
	 * @generated
	 */
	void setPreCallIndication(String value);

	/**
	 * Returns the value of the '<em><b>Post Call Indication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains a CIM_InstMethodCall Indication that describes the post-execution values of the extrinisic method invocation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Call Indication</em>' attribute.
	 * @see #setPostCallIndication(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MethodResult_PostCallIndication()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_InstMethodCall'"
	 * @generated
	 */
	String getPostCallIndication();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MethodResult#getPostCallIndication <em>Post Call Indication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Call Indication</em>' attribute.
	 * @see #getPostCallIndication()
	 * @generated
	 */
	void setPostCallIndication(String value);

} // CIM_MethodResult
