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
 * A representation of the model object '<em><b>CIM KDC Issues Kerberos Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The KDC issues and owns Kerberos tickets. This association captures the relationship between the KDC and its issued tickets.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KDCIssuesKerberosTicket()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAffectsElement\"]' Version='2.16.0' UMLPackagePath='CIM::User::Kerberos' override.Antecedent='CIM_KerberosKeyDistributionCenter REF' override.Antecedent.Deprecated='[\"CIM_ServiceAffectsElement.AffectingElement\"]' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The issuing KDC.' override.Dependent='CIM_KerberosTicket REF' override.Dependent.Deprecated='[\"CIM_ServiceAffectsElement.AffectedElement\"]' override.Dependent.Weak='true' override.Dependent.Description='The managed credential.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_KDCIssuesKerberosTicket extends CIM_ManagedCredential {
} // CIM_KDCIssuesKerberosTicket
