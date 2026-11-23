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
 * A representation of the model object '<em><b>CIM J2ee EJB In Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeEJBInModule is a aggregation of the EJB components within a deployed EJB JAR module.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEJBInModule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.GroupComponent='CIM_J2eeEJBModule REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The EJB Module that is comprised of EJBs.' override.PartComponent='CIM_J2eeEJB REF' override.PartComponent.Min='1' override.PartComponent.Description='The EJB that is a part of the EJB Module.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeEJBInModule extends CIM_ServiceComponent {
} // CIM_J2eeEJBInModule
