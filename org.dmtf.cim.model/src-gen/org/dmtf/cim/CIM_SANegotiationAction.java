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
 * A representation of the model object '<em><b>CIM SA Negotiation Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SANegotiationAction is the base class for negotiated SAs. It is abstract, specifying the common parameters that control the IPsec phase 1 and phase 2 negotiations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SANegotiationAction#getMinLifetimeSeconds <em>Min Lifetime Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SANegotiationAction#getIdleDurationSeconds <em>Idle Duration Seconds</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SANegotiationAction#getMinLifetimeKilobytes <em>Min Lifetime Kilobytes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SANegotiationAction()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SANegotiationAction\",\"IPSP Policy Model.IETF|IKENegotiationAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_SANegotiationAction extends CIM_SAAction {
	/**
	 * Returns the value of the '<em><b>Min Lifetime Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinLifetimeSeconds prevents certain denial of service attacks where the peer requests an arbitrarily low lifetime value, causing renegotiations with expensive Diffie-Hellman operations. The property specifies the minimum lifetime, in seconds, that will be accepted from the peer. A value of zero (the default) indicates that there is no minimum value. A non-zero value specifies the minimum seconds lifetime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Lifetime Seconds</em>' attribute.
	 * @see #setMinLifetimeSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SANegotiationAction_MinLifetimeSeconds()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' MappingStrings='[\"IPSP Policy Model.IETF|IKENegotiationAction.MinLifetimeSeconds\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeSeconds\"]' PUnit='second'"
	 * @generated
	 */
	Long getMinLifetimeSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SANegotiationAction#getMinLifetimeSeconds <em>Min Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lifetime Seconds</em>' attribute.
	 * @see #getMinLifetimeSeconds()
	 * @generated
	 */
	void setMinLifetimeSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Idle Duration Seconds</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IdleDurationSeconds is the time an SA can remain idle (i.e., no traffic protected using the security association) before it is automatically deleted. The default (zero) value indicates that there is no idle duration timer and that the SA is deleted based upon the SA seconds and kilobyte lifetimes. Any non-zero value indicates the number of seconds that the SA may remain unused.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idle Duration Seconds</em>' attribute.
	 * @see #setIdleDurationSeconds(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SANegotiationAction_IdleDurationSeconds()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Seconds' MappingStrings='[\"IPSP Policy Model.IETF|IKENegotiationAction.IdleDurationSeconds\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.IdleDurationSeconds\"]' PUnit='second'"
	 * @generated
	 */
	Long getIdleDurationSeconds();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SANegotiationAction#getIdleDurationSeconds <em>Idle Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle Duration Seconds</em>' attribute.
	 * @see #getIdleDurationSeconds()
	 * @generated
	 */
	void setIdleDurationSeconds(Long value);

	/**
	 * Returns the value of the '<em><b>Min Lifetime Kilobytes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinLifetimeKilobytes prevents certain denial of service attacks where the peer requests an arbitrarily low lifetime value, causing renegotiations with expensive Diffie-Hellman operations. The property specifies the minimum lifetime, in kilobytes, that will be accepted from the peer. A value of zero (the default) indicates that there is no minimum value. A non-zero value specifies the minimum kilobytes lifetime. Note that there has been considerable debate regarding the usefulness of applying kilobyte lifetimes to phase 1 security associations, so it is likely that this property will only apply to the subclass, IPsecAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Lifetime Kilobytes</em>' attribute.
	 * @see #setMinLifetimeKilobytes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SANegotiationAction_MinLifetimeKilobytes()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"IPSP Policy Model.IETF|IKENegotiationAction.MinLifetimeKilobytes\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeKilobytes\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getMinLifetimeKilobytes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SANegotiationAction#getMinLifetimeKilobytes <em>Min Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lifetime Kilobytes</em>' attribute.
	 * @see #getMinLifetimeKilobytes()
	 * @generated
	 */
	void setMinLifetimeKilobytes(Long value);

} // CIM_SANegotiationAction
