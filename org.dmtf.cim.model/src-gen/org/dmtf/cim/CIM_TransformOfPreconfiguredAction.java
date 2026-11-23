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
 * A representation of the model object '<em><b>CIM Transform Of Preconfigured Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TransformOfPreconfiguredAction defines the transforms used by a preconfigured IPsec action. Two, four or six SATransforms can be associated to a PreconfiguredSAAction (applied to the inbound and outbound traffic, as indicated by the Direction property of this association). The order of application of the SATransforms is implicitly defined in RFC2401.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TransformOfPreconfiguredAction#getSPI <em>SPI</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TransformOfPreconfiguredAction#getInboundDirection <em>Inbound Direction</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TransformOfPreconfiguredAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|TransformOfPreconfiguredAction\"]' override.Antecedent='CIM_SATransform REF' override.Antecedent.Min='2' override.Antecedent.Max='6' override.Antecedent.Description='This defines the type of transform used by the referenced PreconfiguredSAAction. A minimum of 2 and maximum of 6 transforms can be defined, for the inbound/outbound directions, representing AH, ESP, and/or an IPCOMP transforms.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|TransformOfPreconfiguredAction.Antecedent\"]' override.Dependent='CIM_PreconfiguredSAAction REF' override.Dependent.Description='This defines the PreconfiguredSAAction which uses the AH, ESP, and/or IPCOMP transforms.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|TransformOfPreconfiguredAction.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_TransformOfPreconfiguredAction extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>SPI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SPI property specifies the security parameter index to be used by the pre-configured action for the associated transform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPI</em>' attribute.
	 * @see #setSPI(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TransformOfPreconfiguredAction_SPI()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"IPSP Policy Model.IETF|TransformOfPreconfiguredAction.SPI\"]' ModelCorrespondence='[\"CIM_IPsecSAEndpoint.SPI\"]'"
	 * @generated
	 */
	Long getSPI();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TransformOfPreconfiguredAction#getSPI <em>SPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPI</em>' attribute.
	 * @see #getSPI()
	 * @generated
	 */
	void setSPI(Long value);

	/**
	 * Returns the value of the '<em><b>Inbound Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InboundDirection specifies whether the SA applies to inbound (TRUE) or outbound (FALSE) traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Direction</em>' attribute.
	 * @see #setInboundDirection(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_TransformOfPreconfiguredAction_InboundDirection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"IPSP Policy Model.IETF|TransformOfPreconfiguredAction.Direction\"]' ModelCorrespondence='[\"CIM_IPsecSAEndpoint.InboundDirection\"]'"
	 * @generated
	 */
	Boolean getInboundDirection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TransformOfPreconfiguredAction#getInboundDirection <em>Inbound Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Direction</em>' attribute.
	 * @see #getInboundDirection()
	 * @generated
	 */
	void setInboundDirection(Boolean value);

} // CIM_TransformOfPreconfiguredAction
