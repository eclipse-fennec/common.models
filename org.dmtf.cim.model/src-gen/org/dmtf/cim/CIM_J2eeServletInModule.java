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
 * A representation of the model object '<em><b>CIM J2ee Servlet In Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_J2eeServletInModule is a aggregation of the servlet components within a deployed WAR module.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeServletInModule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServer' override.GroupComponent='CIM_J2eeWebModule REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The Web Module that is comprised of servlets.' override.PartComponent='CIM_J2eeServlet REF' override.PartComponent.Min='1' override.PartComponent.Description='The Servlet that is a part of the Web Module.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeServletInModule extends CIM_ServiceComponent {
} // CIM_J2eeServletInModule
