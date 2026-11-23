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
package org.dmtf.prs;

import org.dmtf.cim.CIM_Dependency;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Service Requester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_ServiceRequester associates a PRS_ServiceIncident with a PRS_Contact representing the entity requesting service. Note that the Contact class is used for both Requesters and Providers, the context is determined by which association exists.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_ServiceRequester()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='PRS::Support' override.Antecedent='PRS_ServiceIncident REF' override.Antecedent.Description='The PRS_ServiceIncident.' override.Dependent='PRS_Contact REF' override.Dependent.Min='1' override.Dependent.Max='1' override.Dependent.Description='The PRS_Contact.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface PRS_ServiceRequester extends CIM_Dependency {
} // PRS_ServiceRequester
