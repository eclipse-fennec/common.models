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
 * A representation of the model object '<em><b>CIM Contained Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ContainedProposal holds an ordered list of SAProposals that make up an SANegotiationAction. If the referenced NegotiationAction is an IKEAction, then the SAProposal objects MUST be IKEProposals. If the referenced NegotiationAction object is an IPsecTransport/TunnelAction, then the referenced SAProposal objects MUST be IPsecProposals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ContainedProposal#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ContainedProposal()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|ContainedProposal\"]' override.GroupComponent='CIM_SANegotiationAction REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='The SANegotiationAction containing a list of SAProposals.' override.GroupComponent.MappingStrings='[\"IPSP Policy Model.IETF|ContainedProposal.GroupComponent\"]' override.PartComponent='CIM_SAProposal REF' override.PartComponent.Description='The SAProposal in this negotiation action.' override.PartComponent.MappingStrings='[\"IPSP Policy Model.IETF|ContainedProposal.PartComponent\"]' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ContainedProposal extends CIM_Component {
	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SequenceNumber indicates the ordering to be used when chosing from among the proposals. Lower-valued proposals are preferred over proposals with higher values. For ContainedProposals that reference the same SANegotiationAction, SequenceNumber values MUST be unique.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ContainedProposal_SequenceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"IPSP Policy Model.IETF|ContainedProposal.SequenceNumber\"]'"
	 * @generated
	 */
	Integer getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ContainedProposal#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(Integer value);

} // CIM_ContainedProposal
