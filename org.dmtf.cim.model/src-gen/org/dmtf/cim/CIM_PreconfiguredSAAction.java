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
 * A representation of the model object '<em><b>CIM Preconfigured SA Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subclasses of PreconfiguredSAAction are used to create SAs using preconfigured, hard-wired algorithms and keys. No negotiation is necessary. Note that this class is defined as concrete, since its superclass is also concrete. However, it should not be directly instantiated, but one of its subclasses used instead. 
 * 
 * Also note that: 
 * - The SPI for a preconfigured SA action is contained in the association, TransformOfPreconfiguredAction. 
 * - The session key (if applicable) is contained in an instance of SharedSecret. For an instance of the SharedSecret class: The session key is stored in the Secret property; the property protocol contains one of the values, "ESP-encrypt", "ESP-auth" or "AH"; and, the class' property algorithm contains the algorithm used to protect the secret. (The latter can be "PLAINTEXT" if the IPsec entity has no secret storage.) The value of the class' RemoteID property is the concatenation of the remote IPsec peer IP address in dotted decimal, of the character "/", of "IN" (or respectively "OUT") for inbound/outbound SAs, of the character "/" and of the hexadecimal representation of the SPI.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PreconfiguredSAAction#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PreconfiguredSAAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|PreconfiguredSAAction\"]' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_PreconfiguredSAAction extends CIM_SAStaticAction {
	/**
	 * Returns the value of the '<em><b>Lifetime Kilobytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LifetimeKilobytes defines a traffic limit in kilobytes that can be consumed before the SA is deleted. A value of zero (the default) indicates that there is no lifetime associated with this action (i.e., infinite lifetime). A non-zero value is used to indicate that after this number of kilobytes has been consumed the SA must be deleted. 
	 * 
	 * Note that the actual lifetime of the preconfigured SA will be the lesser of the value of this LifetimeKilobytes property and the value of the MaxLifetimeKilobytes property of the associated SATransform. Also note that some SA negotiation protocols (such as IKE) can negotiate the lifetime as an arbitrary length field, it is assumed that a 64-bit integer will be sufficient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lifetime Kilobytes</em>' attribute.
	 * @see #setLifetimeKilobytes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PreconfiguredSAAction_LifetimeKilobytes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"IPSP Policy Model.IETF|PreconfiguredSAAction.LifetimeKilobytes\"]' ModelCorrespondence='[\"CIM_SecurityAssociationEndpoint.LifetimeKilobytes\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getLifetimeKilobytes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PreconfiguredSAAction#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime Kilobytes</em>' attribute.
	 * @see #getLifetimeKilobytes()
	 * @generated
	 */
	void setLifetimeKilobytes(Long value);

} // CIM_PreconfiguredSAAction
